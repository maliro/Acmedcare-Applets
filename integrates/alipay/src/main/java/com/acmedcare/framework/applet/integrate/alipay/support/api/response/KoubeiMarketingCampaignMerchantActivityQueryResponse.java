package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MActivityDetailInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.merchant.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignMerchantActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2635362349735255892L;

	/** 
	 * 创建成功之后返回活动详情信息，包含活动activity_id和活动当前状态activity_status等信息。
	 */
	@ApiField("activity_detail_info")
	private MActivityDetailInfo activityDetailInfo;

	public void setActivityDetailInfo(MActivityDetailInfo activityDetailInfo) {
		this.activityDetailInfo = activityDetailInfo;
	}
	public MActivityDetailInfo getActivityDetailInfo( ) {
		return this.activityDetailInfo;
	}

}
