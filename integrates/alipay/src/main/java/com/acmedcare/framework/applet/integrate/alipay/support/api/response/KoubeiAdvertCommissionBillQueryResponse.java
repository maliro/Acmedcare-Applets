package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertDealBillResponse;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertSettleBillResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5745262521949784548L;

	/** 
	 * 账期(格式为yyyyMM)
	 */
	@ApiField("date")
	private String date;

	/** 
	 * 交易账单
只有type=deal才会有值
	 */
	@ApiField("deal_bill")
	private KbAdvertDealBillResponse dealBill;

	/** 
	 * 结算账单
只有type=settle才会有值
	 */
	@ApiField("settle_bill")
	private KbAdvertSettleBillResponse settleBill;

	/** 
	 * 账单类型
deal-交易账单
settle-结算账单
	 */
	@ApiField("type")
	private String type;

	public void setDate(String date) {
		this.date = date;
	}
	public String getDate( ) {
		return this.date;
	}

	public void setDealBill(KbAdvertDealBillResponse dealBill) {
		this.dealBill = dealBill;
	}
	public KbAdvertDealBillResponse getDealBill( ) {
		return this.dealBill;
	}

	public void setSettleBill(KbAdvertSettleBillResponse settleBill) {
		this.settleBill = settleBill;
	}
	public KbAdvertSettleBillResponse getSettleBill( ) {
		return this.settleBill;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
