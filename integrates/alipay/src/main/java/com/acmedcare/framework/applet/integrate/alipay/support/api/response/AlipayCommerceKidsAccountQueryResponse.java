package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-17 16:19:01
 */
public class AlipayCommerceKidsAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4728764713491948481L;

	/** 
	 * 登陆名
	 */
	@ApiField("login_name")
	private String loginName;

	/** 
	 * 会员id
	 */
	@ApiField("user_id")
	private String userId;

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginName( ) {
		return this.loginName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
