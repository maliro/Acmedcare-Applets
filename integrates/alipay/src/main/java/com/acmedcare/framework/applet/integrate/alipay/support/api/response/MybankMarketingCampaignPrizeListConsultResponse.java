package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PrizeModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.campaign.prize.list.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-23 18:13:06
 */
public class MybankMarketingCampaignPrizeListConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5745951953626799948L;

	/** 
	 * 可用的奖品列表
	 */
	@ApiListField("prize_list")
	@ApiField("prize_model")
	private List<PrizeModel> prizeList;

	public void setPrizeList(List<PrizeModel> prizeList) {
		this.prizeList = prizeList;
	}
	public List<PrizeModel> getPrizeList( ) {
		return this.prizeList;
	}

}
