package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-27 09:55:01
 */
public class MybankCreditSceneprodDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8579757141246565253L;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
