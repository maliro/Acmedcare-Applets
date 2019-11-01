package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.riskscan.single.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskRiskscanSingleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7455149614614361411L;

	/** 
	 * 业务返回数据，这是一个JsonString，Json中的key根据业务不同而不同，接入时商定。
	 */
	@ApiField("scan_result_data")
	private String scanResultData;

	public void setScanResultData(String scanResultData) {
		this.scanResultData = scanResultData;
	}
	public String getScanResultData( ) {
		return this.scanResultData;
	}

}
