package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.template;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

@Data
public class WxMaTemplateAddResult implements Serializable {

  private static final long serialVersionUID = 872250961973834465L;

  @SerializedName("template_id")
  private String templateId;

  public static WxMaTemplateAddResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxMaTemplateAddResult.class);
  }
}
