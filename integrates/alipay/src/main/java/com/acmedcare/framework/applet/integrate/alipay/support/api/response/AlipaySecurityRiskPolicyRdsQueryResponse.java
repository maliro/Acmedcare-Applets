package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.rds.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityRiskPolicyRdsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8526492348191139942L;

	/** 
	 * 人机识别结果。返回HUMAN表示识别结果为人；返回ROBOT表示识别结果为机器。
	 */
	@ApiField("rds_result")
	private String rdsResult;

	public void setRdsResult(String rdsResult) {
		this.rdsResult = rdsResult;
	}
	public String getRdsResult( ) {
		return this.rdsResult;
	}

}
