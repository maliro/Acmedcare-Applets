package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-01 19:00:22
 */
public class AntMerchantExpandIndirectZftConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3825977636629816214L;

	/** 
	 * 资金账户是否审核。当调用没有报错时，本值才有参考意义
	 */
	@ApiField("account_audit")
	private Boolean accountAudit;

	/** 
	 * 咨询申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 是否风控审核。当调用没有报错时，本值才有参考意义
	 */
	@ApiField("risk_audit")
	private Boolean riskAudit;

	public void setAccountAudit(Boolean accountAudit) {
		this.accountAudit = accountAudit;
	}
	public Boolean getAccountAudit( ) {
		return this.accountAudit;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setRiskAudit(Boolean riskAudit) {
		this.riskAudit = riskAudit;
	}
	public Boolean getRiskAudit( ) {
		return this.riskAudit;
	}

}
