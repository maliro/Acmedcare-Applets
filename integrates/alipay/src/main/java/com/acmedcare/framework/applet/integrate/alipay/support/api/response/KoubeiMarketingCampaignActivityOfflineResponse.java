package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.offline response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignActivityOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 4499829639527737688L;

	/** 
	 * 活动子状态，如审核中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

}
