package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.alideviceinfo.offlinecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-24 17:16:36
 */
public class AlipayCommerceAlideviceinfoOfflinecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6126152722822527238L;

	/** 
	 * 机具统一ID
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/** 
	 * 离线支付token
	 */
	@ApiField("token")
	private String token;

	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}
	public String getBizTid( ) {
		return this.bizTid;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
