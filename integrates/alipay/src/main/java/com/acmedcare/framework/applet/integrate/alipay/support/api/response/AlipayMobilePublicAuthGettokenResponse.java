package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.auth.gettoken response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicAuthGettokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 4459385796629517342L;

	/** 
	 * 返回码。处理成功：200；处理失败：请参考返回码。
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 支付宝返回的处理结果说明，请参考返回码
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 跳转到授权页面需要的Token
	 */
	@ApiField("token")
	private String token;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
