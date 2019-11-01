package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.auth.info.authquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaAuthInfoAuthqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6621718117197764535L;

	/** 
	 * 是否已经授权； authorized＝true 表示已授权, authorized＝false表示未授权
	 */
	@ApiField("authorized")
	private Boolean authorized;

	/** 
	 * 当前授权业务查询标识
	 */
	@ApiField("open_id")
	private String openId;

	public void setAuthorized(Boolean authorized) {
		this.authorized = authorized;
	}
	public Boolean getAuthorized( ) {
		return this.authorized;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}
