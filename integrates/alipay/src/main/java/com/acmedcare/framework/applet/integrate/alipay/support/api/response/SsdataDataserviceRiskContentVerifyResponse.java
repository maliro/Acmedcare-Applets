package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.RiskResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.content.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 16:05:35
 */
public class SsdataDataserviceRiskContentVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1296243165879628386L;

	/** 
	 * 对应传入的每一种风险类型的所有风险识别结果
	 */
	@ApiListField("risk_result")
	@ApiField("risk_result")
	private List<RiskResult> riskResult;

	/** 
	 * 分值
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setRiskResult(List<RiskResult> riskResult) {
		this.riskResult = riskResult;
	}
	public List<RiskResult> getRiskResult( ) {
		return this.riskResult;
	}

	public void setScore(String score) {
		this.score = score;
	}
	public String getScore( ) {
		return this.score;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
