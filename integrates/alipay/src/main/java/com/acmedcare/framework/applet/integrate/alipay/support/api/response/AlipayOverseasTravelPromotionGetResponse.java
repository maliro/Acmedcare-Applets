package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromotionInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.promotion.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-08 11:00:01
 */
public class AlipayOverseasTravelPromotionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4547452281386315123L;

	/** 
	 * 优惠信息列表
	 */
	@ApiListField("promotions")
	@ApiField("promotion_info")
	private List<PromotionInfo> promotions;

	/** 
	 * 入参匹配的优惠总数，分页使用
	 */
	@ApiField("total")
	private Long total;

	public void setPromotions(List<PromotionInfo> promotions) {
		this.promotions = promotions;
	}
	public List<PromotionInfo> getPromotions( ) {
		return this.promotions;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
