package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询网商会员信息
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:19:59
 */
public class MybankCreditUserRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3637145384667745578L;

	/**
	 * 站点会员信息
	 */
	@ApiField("member")
	private Member member;

	public Member getMember() {
		return this.member;
	}
	public void setMember(Member member) {
		this.member = member;
	}

}
