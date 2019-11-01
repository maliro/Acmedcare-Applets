package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序查询成员
 *
 * @author auto create
 * @since 1.0, 2018-12-25 16:45:09
 */
public class AlipayOpenAppMembersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8118784866299859934L;

	/**
	 * 成员的角色类型，DEVELOPER-开发者，EXPERIENCER-体验者
	 */
	@ApiField("role")
	private String role;

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
