package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.fulfillment.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-14 11:16:02
 */
public class ZhimaCreditEpSceneFulfillmentSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6853752974974793715L;

	/** 
	 * 履约单号
	 */
	@ApiField("fulfillment_order_no")
	private String fulfillmentOrderNo;

	public void setFulfillmentOrderNo(String fulfillmentOrderNo) {
		this.fulfillmentOrderNo = fulfillmentOrderNo;
	}
	public String getFulfillmentOrderNo( ) {
		return this.fulfillmentOrderNo;
	}

}
