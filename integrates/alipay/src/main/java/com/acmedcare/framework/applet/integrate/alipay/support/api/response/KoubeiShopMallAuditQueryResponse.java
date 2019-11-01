package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.audit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiShopMallAuditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2466988842813299968L;

	/** 
	 * 审核备注
	 */
	@ApiField("audit_remark")
	private String auditRemark;

	/** 
	 * 工单审核状态：AUDITING 审核中，SUCCESS 通过，REJECTED 拒绝
	 */
	@ApiField("audit_status")
	private String auditStatus;

	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}
	public String getAuditRemark( ) {
		return this.auditRemark;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

}
