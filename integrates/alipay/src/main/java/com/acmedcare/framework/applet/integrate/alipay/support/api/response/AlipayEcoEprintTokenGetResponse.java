package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.eprint.token.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:38
 */
public class AlipayEcoEprintTokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5377553661543473885L;

	/** 
	 * 易联云token
	 */
	@ApiField("eprint_token")
	private String eprintToken;

	public void setEprintToken(String eprintToken) {
		this.eprintToken = eprintToken;
	}
	public String getEprintToken( ) {
		return this.eprintToken;
	}

}
