package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.ycstest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenServicemarketYcstestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5357364922931191749L;

	/** 
	 * 111
	 */
	@ApiField("out_1")
	private String out1;

	/** 
	 * 222
	 */
	@ApiField("out_2")
	private String out2;

	public void setOut1(String out1) {
		this.out1 = out1;
	}
	public String getOut1( ) {
		return this.out1;
	}

	public void setOut2(String out2) {
		this.out2 = out2;
	}
	public String getOut2( ) {
		return this.out2;
	}

}
