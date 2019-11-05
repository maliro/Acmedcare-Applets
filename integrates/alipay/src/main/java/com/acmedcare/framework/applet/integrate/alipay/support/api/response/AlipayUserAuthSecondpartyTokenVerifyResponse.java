package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.secondparty.token.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-16 20:05:01
 */
public class AlipayUserAuthSecondpartyTokenVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8897663217273993941L;

	/** 
	 * 淘宝用户id
	 */
	@ApiField("tb_user_id")
	private String tbUserId;

	public void setTbUserId(String tbUserId) {
		this.tbUserId = tbUserId;
	}
	public String getTbUserId( ) {
		return this.tbUserId;
	}

}
