package com.acmedcare.framework.applet.integrate.wechat.support.common.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * 卡券Api签名.
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @version 15/11/8
 */
@Data
public class WxCardApiSignature implements Serializable {
  private static final long serialVersionUID = 158176707226975979L;

  private String appId;

  private String cardId;

  private String cardType;

  private String locationId;

  private String code;

  private String openId;

  private Long timestamp;

  private String nonceStr;

  private String signature;

  @Override
  public String toString() {
    return WxGsonBuilder.create().toJson(this);
  }
}
