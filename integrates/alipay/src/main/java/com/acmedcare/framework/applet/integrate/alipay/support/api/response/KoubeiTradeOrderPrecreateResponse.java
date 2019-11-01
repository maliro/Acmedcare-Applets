package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiTradeOrderPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3122178723187549361L;

	/** 
	 * 订单号，唯一标识口碑侧一笔订单
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 业务用到的码值，当前仅支持二维码
当biz_type传入POST_ORDER_PAY时，该字段为必选
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
