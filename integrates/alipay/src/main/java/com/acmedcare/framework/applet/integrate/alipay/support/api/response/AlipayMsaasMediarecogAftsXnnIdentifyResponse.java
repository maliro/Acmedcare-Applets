package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.afts.xnn.identify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 19:55:01
 */
public class AlipayMsaasMediarecogAftsXnnIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5639488545363971673L;

	/** 
	 * 算法返回结果，json字符串
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
