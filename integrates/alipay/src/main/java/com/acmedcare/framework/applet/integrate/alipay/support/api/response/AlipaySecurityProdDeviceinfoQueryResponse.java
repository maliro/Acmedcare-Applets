package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.deviceinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdDeviceinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7233396927898327489L;

	/** 
	 * device_info，查询返回的设备数据字段JSON字符串
	 */
	@ApiField("device_info")
	private String deviceInfo;

	/** 
	 * risk_info，查询返回的设备风险字段JSON字符串
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getDeviceInfo( ) {
		return this.deviceInfo;
	}

	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}
	public String getRiskInfo( ) {
		return this.riskInfo;
	}

}
