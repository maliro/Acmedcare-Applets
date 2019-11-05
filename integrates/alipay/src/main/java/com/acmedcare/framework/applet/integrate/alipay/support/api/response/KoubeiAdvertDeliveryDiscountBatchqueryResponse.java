package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DiscountInfo;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertIdentifyResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1842957998433346383L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("discount_info")
	private List<DiscountInfo> discounts;

	/** 
	 * 券领取结果
	 */
	@ApiField("purchase_datas")
	private KbAdvertIdentifyResponse purchaseDatas;

	/** 
	 * 本次推荐的唯一标识
	 */
	@ApiField("recommend_id")
	private String recommendId;

	public void setDiscounts(List<DiscountInfo> discounts) {
		this.discounts = discounts;
	}
	public List<DiscountInfo> getDiscounts( ) {
		return this.discounts;
	}

	public void setPurchaseDatas(KbAdvertIdentifyResponse purchaseDatas) {
		this.purchaseDatas = purchaseDatas;
	}
	public KbAdvertIdentifyResponse getPurchaseDatas( ) {
		return this.purchaseDatas;
	}

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

}
