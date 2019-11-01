package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.kbdelivery.delivery.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-03 11:33:13
 */
public class KoubeiTradeKbdeliveryDeliveryCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6176585932789143781L;

	/** 
	 * 成功关闭时间，时间格式:
yyyyMMddHHmmss
	 */
	@ApiField("gmt_close")
	private String gmtClose;

	/** 
	 * 口碑物流单号
	 */
	@ApiField("logistics_order_no")
	private String logisticsOrderNo;

	public void setGmtClose(String gmtClose) {
		this.gmtClose = gmtClose;
	}
	public String getGmtClose( ) {
		return this.gmtClose;
	}

	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}
	public String getLogisticsOrderNo( ) {
		return this.logisticsOrderNo;
	}

}
