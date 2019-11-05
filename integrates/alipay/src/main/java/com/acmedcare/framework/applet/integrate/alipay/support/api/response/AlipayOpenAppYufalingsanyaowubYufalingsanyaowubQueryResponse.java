package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufalingsanyaowub.yufalingsanyaowub.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5149224537914267386L;

	/** 
	 * yufaa
	 */
	@ApiField("yufaa")
	private String yufaa;

	public void setYufaa(String yufaa) {
		this.yufaa = yufaa;
	}
	public String getYufaa( ) {
		return this.yufaa;
	}

}
