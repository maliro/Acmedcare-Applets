package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.life.access.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-24 18:05:01
 */
public class AlipayInsMarketingLifeAccessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6634399391994236181L;

	/** 
	 * 是否准入
	 */
	@ApiField("access")
	private Boolean access;

	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getAccess( ) {
		return this.access;
	}

}
