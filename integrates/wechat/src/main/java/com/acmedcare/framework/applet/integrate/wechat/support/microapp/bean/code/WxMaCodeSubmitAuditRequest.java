package com.acmedcare.framework.applet.integrate.wechat.support.microapp.bean.code;

import com.acmedcare.framework.applet.integrate.wechat.support.microapp.util.json.WxMaGsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 提交审核的请求
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @since 2018-04-26 19:45
 */
@Data
@Builder
public class WxMaCodeSubmitAuditRequest implements Serializable {
  private static final long serialVersionUID = 8854979405505241314L;
  /** 提交审核项的一个列表（至少填写1项，至多填写5项） */
  @SerializedName("item_list")
  private List<WxMaCategory> itemList;

  public String toJson() {
    return WxMaGsonBuilder.create().toJson(this);
  }
}
