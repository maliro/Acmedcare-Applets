package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.settle.receivables.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-07 14:52:41
 */
public class AlipayTradeSettleReceivablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4231156118781244561L;

	/** 
	 * 待结算金额，人民币，单位为元
	 */
	@ApiField("unsettled_amount")
	private String unsettledAmount;

	public void setUnsettledAmount(String unsettledAmount) {
		this.unsettledAmount = unsettledAmount;
	}
	public String getUnsettledAmount( ) {
		return this.unsettledAmount;
	}

}
