package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.printer.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:26
 */
public class AlipayEcoPrinterStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5634836829544287166L;

	/** 
	 * 0离线 1在线 2缺纸
	 */
	@ApiField("state")
	private Long state;

	public void setState(Long state) {
		this.state = state;
	}
	public Long getState( ) {
		return this.state;
	}

}
