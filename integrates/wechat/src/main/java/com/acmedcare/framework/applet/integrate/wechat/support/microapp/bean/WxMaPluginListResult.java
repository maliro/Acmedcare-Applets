package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.common.util.json.WxGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class WxMaPluginListResult implements Serializable {

  private static final long serialVersionUID = -5898572369543593656L;

  @SerializedName("plugin_list")
  private List<PluginInfo> pluginList;

  public static WxMaPluginListResult fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxMaPluginListResult.class);
  }

  @Data
  public static class PluginInfo {

    @SerializedName("appid")
    private String appId;

    private String status;

    @SerializedName("nickname")
    private String nickName;

    @SerializedName("headimgurl")
    private String headImgUrl;
  }
}
