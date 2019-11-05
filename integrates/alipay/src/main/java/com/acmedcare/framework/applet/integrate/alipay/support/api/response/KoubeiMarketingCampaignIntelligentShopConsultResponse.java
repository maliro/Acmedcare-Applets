package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IntelligentPromoShopSummaryInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.shop.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignIntelligentShopConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3217741763429727716L;

	/** 
	 * 总共项数
	 */
	@ApiField("items")
	private String items;

	/** 
	 * 智能营销方案符合标准的门店列表
	 */
	@ApiListField("shops")
	@ApiField("intelligent_promo_shop_summary_info")
	private List<IntelligentPromoShopSummaryInfo> shops;

	public void setItems(String items) {
		this.items = items;
	}
	public String getItems( ) {
		return this.items;
	}

	public void setShops(List<IntelligentPromoShopSummaryInfo> shops) {
		this.shops = shops;
	}
	public List<IntelligentPromoShopSummaryInfo> getShops( ) {
		return this.shops;
	}

}
