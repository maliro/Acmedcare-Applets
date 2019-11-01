package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MActivityDetailInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.merchant.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignMerchantActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7733583386136843699L;

	/** 
	 * 活动详细信息
	 */
	@ApiListField("activity_detail_info_list")
	@ApiField("m_activity_detail_info")
	private List<MActivityDetailInfo> activityDetailInfoList;

	public void setActivityDetailInfoList(List<MActivityDetailInfo> activityDetailInfoList) {
		this.activityDetailInfoList = activityDetailInfoList;
	}
	public List<MActivityDetailInfo> getActivityDetailInfoList( ) {
		return this.activityDetailInfoList;
	}

}
