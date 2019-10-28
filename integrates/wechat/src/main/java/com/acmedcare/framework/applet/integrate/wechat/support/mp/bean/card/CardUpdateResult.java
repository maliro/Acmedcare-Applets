package com.acmedcare.framework.applet.integrate.wechat.support.mp.bean.card;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version}
 * @date 2018/11/07
 */
@Data
public class CardUpdateResult {

  private int errcode;

  private String errmsg;

  /** 此次更新是否需要提审，true为需要，false为不需要。 */
  @SerializedName("send_check")
  private boolean sendCheck;
}
