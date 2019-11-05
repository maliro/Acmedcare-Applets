package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 添加小程序开发者或体验者
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:15:33
 */
public class AlipayOpenAppMembersCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2535836948794424232L;

	/**
	 * 支付宝登录账号ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 成员的角色类型，DEVELOPER-开发者，EXPERIENCER-体验者
	 */
	@ApiField("role")
	private String role;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
