package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.itemorder.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiTradeItemorderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5741132816711774974L;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 退款唯一请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 实际退的资金。
	 */
	@ApiField("real_refund_amount")
	private String realRefundAmount;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRealRefundAmount(String realRefundAmount) {
		this.realRefundAmount = realRefundAmount;
	}
	public String getRealRefundAmount( ) {
		return this.realRefundAmount;
	}

}
