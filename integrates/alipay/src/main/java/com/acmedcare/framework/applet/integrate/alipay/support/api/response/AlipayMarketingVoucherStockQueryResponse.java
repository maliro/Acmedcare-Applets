package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.stock.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingVoucherStockQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6527757734153686446L;

	/** 
	 * 剩余可用库存数量
	 */
	@ApiField("available_count")
	private Long availableCount;

	/** 
	 * 库存总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}
	public Long getAvailableCount( ) {
		return this.availableCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
