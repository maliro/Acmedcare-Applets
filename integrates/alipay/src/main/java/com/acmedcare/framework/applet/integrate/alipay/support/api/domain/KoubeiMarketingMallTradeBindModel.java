package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 绑定用户与商圈对应的授权关系
 *
 * @author auto create
 * @since 1.0, 2018-05-25 15:22:07
 */
public class KoubeiMarketingMallTradeBindModel extends AlipayObject {

	private static final long serialVersionUID = 4494388359929255566L;

	/**
	 * 用户的授权动作：auth授权，unAuth取消授权
	 */
	@ApiField("action")
	private String action;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
