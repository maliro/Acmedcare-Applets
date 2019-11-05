package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.ctid.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdCtidInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1554217342642419422L;

	/** 
	 * 随机数，用于生成authcode
	 */
	@ApiField("random_data")
	private String randomData;

	/** 
	 * 公安一所返回的流水号
	 */
	@ApiField("stream_number")
	private String streamNumber;

	public void setRandomData(String randomData) {
		this.randomData = randomData;
	}
	public String getRandomData( ) {
		return this.randomData;
	}

	public void setStreamNumber(String streamNumber) {
		this.streamNumber = streamNumber;
	}
	public String getStreamNumber( ) {
		return this.streamNumber;
	}

}
