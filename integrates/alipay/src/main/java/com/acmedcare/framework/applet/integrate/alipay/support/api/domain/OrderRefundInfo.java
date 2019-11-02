package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 第三方的订单退款明细：包括服务号和单个服务的退款金额
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:30:03
 */
public class OrderRefundInfo extends AlipayObject {

	private static final long serialVersionUID = 6625841298953195268L;

	/**
	 * 服务订单的退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 服务订单号，当商家退款时，可能包含多个服务订单
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}
	public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

}