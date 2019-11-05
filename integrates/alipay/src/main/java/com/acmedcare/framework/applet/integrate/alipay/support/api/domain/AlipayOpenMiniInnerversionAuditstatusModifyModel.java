package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序审核结果
 *
 * @author auto create
 * @since 1.0, 2018-11-01 17:44:05
 */
public class AlipayOpenMiniInnerversionAuditstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7864718371713918973L;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 审核结果描述
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/**
	 * 审核结果
	 */
	@ApiField("audit_result")
	private String auditResult;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAuditMemo() {
		return this.auditMemo;
	}
	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	public String getAuditResult() {
		return this.auditResult;
	}
	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
