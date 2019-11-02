package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 签约任务申请结果
 *
 * @author auto create
 * @since 1.0, 2017-08-04 11:14:29
 */
public class SignTaskResult extends AlipayObject {

	private static final long serialVersionUID = 1657392172337674214L;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 支付宝签约入口地址
	 */
	@ApiField("sign_enter_url")
	private String signEnterUrl;

	/**
	 * 签名任务流水号
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getSignEnterUrl() {
		return this.signEnterUrl;
	}
	public void setSignEnterUrl(String signEnterUrl) {
		this.signEnterUrl = signEnterUrl;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}