package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.monitordevice.qualitycenter.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceDataMonitordeviceQualitycenterModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6849915638711245713L;

	/** 
	 * error_detail，出错的情况下返回，包含具体信息。
	 */
	@ApiField("error_detail")
	private String errorDetail;

	public void setErrorDetail(String errorDetail) {
		this.errorDetail = errorDetail;
	}
	public String getErrorDetail( ) {
		return this.errorDetail;
	}

}
