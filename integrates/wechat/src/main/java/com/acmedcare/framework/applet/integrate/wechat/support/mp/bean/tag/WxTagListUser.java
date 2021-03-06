package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.tag;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 *
 * <pre>
 * 获取标签下粉丝列表的结果对象
 * Created by Acmedcare+ Developer on 2016-09-19.
 * </pre>
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxTagListUser implements Serializable {
  private static final long serialVersionUID = -4551768374200676112L;

  /** "count":2,这次获取的粉丝数量. */
  @SerializedName("count")
  private Integer count;
  /** "data" 粉丝列表. */
  @SerializedName("data")
  private WxTagListUserData data;
  /** "next_openid" 拉取列表最后一个用户的openid. */
  @SerializedName("next_openid")
  private String nextOpenid;

  public static WxTagListUser fromJson(String json) {
    return WxMpGsonBuilder.create().fromJson(json, WxTagListUser.class);
  }

  public String toJson() {
    return WxMpGsonBuilder.create().toJson(this);
  }

  @Override
  public String toString() {
    return this.toJson();
  }

  @Data
  public static class WxTagListUserData implements Serializable {
    private static final long serialVersionUID = -8584537400336245701L;

    /** openid 列表. */
    @SerializedName("openid")
    private List<String> openidList;

    @Override
    public String toString() {
      return WxMpGsonBuilder.create().toJson(this);
    }
  }
}
