package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-15 17:16:10
 */
public class AlipayTradePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8112681154811263886L;

	/** 
	 * 商户的订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
