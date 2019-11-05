package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ActivityParticipation;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.participation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-14 20:58:23
 */
public class ZhimaMerchantActivityParticipationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6154989796352979257L;

	/** 
	 * 用户参加活动模型
	 */
	@ApiField("activity_participation")
	private ActivityParticipation activityParticipation;

	public void setActivityParticipation(ActivityParticipation activityParticipation) {
		this.activityParticipation = activityParticipation;
	}
	public ActivityParticipation getActivityParticipation( ) {
		return this.activityParticipation;
	}

}
