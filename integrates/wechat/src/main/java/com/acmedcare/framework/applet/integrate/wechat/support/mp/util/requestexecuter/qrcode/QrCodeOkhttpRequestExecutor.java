package com.acmedcare.framework.applet.integrate.wechat.support.mp.util.requestexecuter.qrcode;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.fs.FileUtils;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpProxyInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.result.WxMpQrCodeTicket;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2017/5/5
 */
public class QrCodeOkhttpRequestExecutor
    extends QrCodeRequestExecutor<OkHttpClient, OkHttpProxyInfo> {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public QrCodeOkhttpRequestExecutor(RequestHttp requestHttp) {
    super(requestHttp);
  }

  @Override
  public File execute(String uri, WxMpQrCodeTicket ticket) throws WxErrorException, IOException {
    logger.info("QrCodeOkhttpRequestExecutor is running");

    if (ticket != null) {
      if (uri.indexOf('?') == -1) {
        uri += '?';
      }
      uri +=
          uri.endsWith("?")
              ? "ticket=" + URLEncoder.encode(ticket.getTicket(), "UTF-8")
              : "&ticket=" + URLEncoder.encode(ticket.getTicket(), "UTF-8");
    }

    OkHttpClient client = requestHttp.getRequestHttpClient();
    Request request = new Request.Builder().url(uri).get().build();
    Response response = client.newCall(request).execute();
    String contentTypeHeader = response.header("Content-Type");
    if ("text/plain".equals(contentTypeHeader)) {
      String responseContent = response.body().string();
      throw new WxErrorException(WxError.fromJson(responseContent, WxType.MP));
    }

    try (InputStream inputStream = response.body().byteStream()) {
      return FileUtils.createTmpFile(inputStream, UUID.randomUUID().toString(), "jpg");
    }
  }
}
