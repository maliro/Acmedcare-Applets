package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.page.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-27 14:44:35
 */
public class AlipayFundTransPagePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7174693115785651543L;

	/** 
	 * 该笔转账在支付宝系统内部的单据ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户端的唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * SUCCESS：转账成功；
WAIT_PAY：转账订单等待支付；
CLOSED：订单超时关闭，截止订单支付超时时间(time_expire)仍未支付，单据状态会变更为CLOSED；
	 */
	@ApiField("status")
	private String status;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
