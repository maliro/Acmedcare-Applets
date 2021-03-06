package com.acmedcare.framework.applet.integrate.wechat.support.open.util;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.crypto.WxCryptUtil;
import com.acmedcare.framework.applet.integrate.wechat.support.open.api.WxOpenConfigStorage;
import org.apache.commons.codec.binary.Base64;

/** @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a> */
public class WxOpenCryptUtil extends WxCryptUtil {
  /**
   * 构造函数
   *
   * @param wxOpenConfigStorage
   */
  public WxOpenCryptUtil(WxOpenConfigStorage wxOpenConfigStorage) {
    /*
     * @param token          公众平台上，开发者设置的token
     * @param encodingAesKey 公众平台上，开发者设置的EncodingAESKey
     * @param appId          公众平台appid
     */
    String encodingAesKey = wxOpenConfigStorage.getComponentAesKey();
    String token = wxOpenConfigStorage.getComponentToken();
    String appId = wxOpenConfigStorage.getComponentAppId();

    this.token = token;
    this.appidOrCorpid = appId;
    this.aesKey = Base64.decodeBase64(encodingAesKey + "=");
  }
}
