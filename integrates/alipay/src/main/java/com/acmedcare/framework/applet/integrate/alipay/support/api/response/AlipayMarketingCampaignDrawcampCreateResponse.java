package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-16 12:01:39
 */
public class AlipayMarketingCampaignDrawcampCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2138457395354796912L;

	/** 
	 * 抽奖活动id
	 */
	@ApiField("camp_id")
	private String campId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

}
