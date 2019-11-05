package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sts.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-24 18:40:07
 */
public class AlipayOpenStsTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4334581891444213777L;

	/** 
	 * 安全令牌失效时间（1970年1月1日00:00:00开始算起的毫秒数）
	 */
	@ApiField("expiration")
	private String expiration;

	/** 
	 * 安全令牌
	 */
	@ApiField("security_token")
	private String securityToken;

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getExpiration( ) {
		return this.expiration;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}
	public String getSecurityToken( ) {
		return this.securityToken;
	}

}
