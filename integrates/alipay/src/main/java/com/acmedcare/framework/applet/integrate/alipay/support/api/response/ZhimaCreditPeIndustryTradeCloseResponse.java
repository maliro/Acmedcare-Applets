package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.industry.trade.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-16 11:45:01
 */
public class ZhimaCreditPeIndustryTradeCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4134276926215355674L;

	/** 
	 * 传入的资金单号
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/** 
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
	}
	public String getOutFundNo( ) {
		return this.outFundNo;
	}

	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}
	public String getZmOrderId( ) {
		return this.zmOrderId;
	}

}
