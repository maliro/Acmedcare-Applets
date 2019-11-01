package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.promorulecenter.rule.analyze response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayPromorulecenterRuleAnalyzeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1265949778478983377L;

	/** 
	 * 未通过条件描述信息
	 */
	@ApiField("fail_condition_msg")
	private String failConditionMsg;

	/** 
	 * 未通过的条件
	 */
	@ApiField("fail_condition_name")
	private String failConditionName;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 服务调用是否成功
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 规则是否通过
	 */
	@ApiField("triggered")
	private String triggered;

	public void setFailConditionMsg(String failConditionMsg) {
		this.failConditionMsg = failConditionMsg;
	}
	public String getFailConditionMsg( ) {
		return this.failConditionMsg;
	}

	public void setFailConditionName(String failConditionName) {
		this.failConditionName = failConditionName;
	}
	public String getFailConditionName( ) {
		return this.failConditionName;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setTriggered(String triggered) {
		this.triggered = triggered;
	}
	public String getTriggered( ) {
		return this.triggered;
	}

}
