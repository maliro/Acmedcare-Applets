package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hide.deviceid.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskHideDeviceidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1312382586267597845L;

	/** 
	 * 设备指纹的apdid
	 */
	@ApiField("deviceid")
	private String deviceid;

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceid( ) {
		return this.deviceid;
	}

}
