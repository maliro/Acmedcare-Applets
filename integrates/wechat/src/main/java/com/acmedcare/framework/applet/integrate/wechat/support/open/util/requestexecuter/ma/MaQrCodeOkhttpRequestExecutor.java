package com.acmedcare.framework.applet.integrate.wechat.support.open.util.requestexecuter.ma;

import com.acmedcare.framework.applet.integrate.wechat.support.common.WxType;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxError;
import com.acmedcare.framework.applet.integrate.wechat.support.common.error.WxErrorException;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.fs.FileUtils;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.RequestHttp;
import com.acmedcare.framework.applet.integrate.wechat.support.common.util.http.okhttp.OkHttpProxyInfo;
import com.acmedcare.framework.applet.integrate.wechat.support.open.bean.ma.WxMaQrcodeParam;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @author yqx
 * @date 2018-09-13
 */
public class MaQrCodeOkhttpRequestExecutor
    extends MaQrCodeRequestExecutor<OkHttpClient, OkHttpProxyInfo> {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public MaQrCodeOkhttpRequestExecutor(RequestHttp requestHttp) {
    super(requestHttp);
  }

  @Override
  public File execute(String uri, WxMaQrcodeParam qrcodeParam)
      throws WxErrorException, IOException {
    if (qrcodeParam != null && StringUtils.isNotBlank(qrcodeParam.getPagePath())) {
      if (uri.indexOf('?') == -1) {
        uri += '?';
      }
      uri +=
          uri.endsWith("?")
              ? "path=" + URLEncoder.encode(qrcodeParam.getRequestPath(), "UTF-8")
              : "&path=" + URLEncoder.encode(qrcodeParam.getRequestPath(), "UTF-8");
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
