package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.YLBPriceDetailInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.price.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankFinanceYulibaoPriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7291766837249921363L;

	/** 
	 * 余利宝行情信息列表
	 */
	@ApiListField("ylb_price_detail_infos")
	@ApiField("y_l_b_price_detail_info")
	private List<YLBPriceDetailInfo> ylbPriceDetailInfos;

	public void setYlbPriceDetailInfos(List<YLBPriceDetailInfo> ylbPriceDetailInfos) {
		this.ylbPriceDetailInfos = ylbPriceDetailInfos;
	}
	public List<YLBPriceDetailInfo> getYlbPriceDetailInfos( ) {
		return this.ylbPriceDetailInfos;
	}

}
