package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8763933919513621933L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 短链接url
	 */
	@ApiField("shortlink")
	private String shortlink;

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

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
