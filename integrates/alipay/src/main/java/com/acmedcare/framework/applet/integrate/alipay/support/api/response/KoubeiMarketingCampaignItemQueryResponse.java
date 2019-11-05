package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromoItemInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-05 16:48:35
 */
public class KoubeiMarketingCampaignItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4337347598359899664L;

	/** 
	 * 商品详情，包含门店信息
	 */
	@ApiField("item")
	private PromoItemInfo item;

	public void setItem(PromoItemInfo item) {
		this.item = item;
	}
	public PromoItemInfo getItem( ) {
		return this.item;
	}

}
