package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 外部企业员工信息
 *
 * @author auto create
 * @since 1.0, 2017-07-25 15:32:34
 */
public class StaffInfo extends AlipayObject {

	private static final long serialVersionUID = 2617538436699858645L;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
