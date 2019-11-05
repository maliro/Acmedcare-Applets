package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 统一收单撤销确认结算接口
 *
 * @author auto create
 * @since 1.0, 2019-07-08 15:18:03
 */
public class AlipayTradeSettleConfirmCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3839393145214227773L;

	/**
	 * 原始确认结算时的请求号，对应于需要撤销的那笔请求
	 */
	@ApiField("ori_request_no")
	private String oriRequestNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOriRequestNo() {
		return this.oriRequestNo;
	}
	public void setOriRequestNo(String oriRequestNo) {
		this.oriRequestNo = oriRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
