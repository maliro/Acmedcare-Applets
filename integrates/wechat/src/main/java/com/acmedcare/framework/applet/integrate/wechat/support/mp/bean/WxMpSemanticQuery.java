package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean;

import com.acmedcare.framework.applet.integrate.wechat.support.mp.util.json.WxMpGsonBuilder;
import lombok.Data;

import java.io.Serializable;

/**
 * 语义理解查询用对象
 *
 * <p>http://mp.weixin.qq.com/wiki/index.php?title=语义理解
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 */
@Data
public class WxMpSemanticQuery implements Serializable {
  private static final long serialVersionUID = 7685873048199870690L;

  private String query;
  private String category;
  private Float latitude;
  private Float longitude;
  private String city;
  private String region;
  private String appid;
  private String uid;

  public String toJson() {
    return WxMpGsonBuilder.create().toJson(this);
  }
}
