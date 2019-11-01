package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 预下单的订单信息
 *
 * @author auto create
 * @since 1.0, 2019-07-23 11:48:15
 */
public class TradePrecreateConfirmOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 6832937259864629418L;

	/**
	 * 对交易或商品的描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 支付超时的绝对时间
	 */
	@ApiField("pay_expire_time")
	private Date payExpireTime;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public Date getPayExpireTime() {
		return this.payExpireTime;
	}
	public void setPayExpireTime(Date payExpireTime) {
		this.payExpireTime = payExpireTime;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
