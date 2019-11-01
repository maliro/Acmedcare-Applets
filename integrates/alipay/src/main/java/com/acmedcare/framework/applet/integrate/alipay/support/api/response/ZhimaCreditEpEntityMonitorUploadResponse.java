package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.entity.monitor.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpEntityMonitorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1662155794823677172L;

	/** 
	 * 成功返回true,失败返回false
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 方案ID
	 */
	@ApiField("solution_id")
	private String solutionId;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

}
