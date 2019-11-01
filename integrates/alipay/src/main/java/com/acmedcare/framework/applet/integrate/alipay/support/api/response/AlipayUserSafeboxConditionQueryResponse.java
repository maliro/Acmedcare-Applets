package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.safebox.condition.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserSafeboxConditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6659642842856483921L;

	/** 
	 * 产品是否紧急下线状态。true：紧急下线，false：未紧急下线。
	 */
	@ApiField("emergency_offline")
	private Boolean emergencyOffline;

	/** 
	 * 是否用户已经签约。已经签约：true，未签约：false。
	 */
	@ApiField("has_agreement")
	private Boolean hasAgreement;

	public void setEmergencyOffline(Boolean emergencyOffline) {
		this.emergencyOffline = emergencyOffline;
	}
	public Boolean getEmergencyOffline( ) {
		return this.emergencyOffline;
	}

	public void setHasAgreement(Boolean hasAgreement) {
		this.hasAgreement = hasAgreement;
	}
	public Boolean getHasAgreement( ) {
		return this.hasAgreement;
	}

}
