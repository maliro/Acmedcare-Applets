package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.offline.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignActivityOfflineCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2322852574529368525L;

	/** 
	 * 创建成功的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 创建成功的券模版id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

}
