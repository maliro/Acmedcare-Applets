package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.device;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author keungtung.
 * @date 10/12/2016
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WxDeviceBindResult extends AbstractDeviceBean {
  private static final long serialVersionUID = 4687725146279339359L;

  @SerializedName("base_resp")
  private BaseResp baseResp;

  public static WxDeviceBindResult fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxDeviceBindResult.class);
  }
}
