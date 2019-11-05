package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayOrderDataOpenapiResultInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.consumer.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-19 15:02:12
 */
public class AlipayMerchantOrderConsumerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3882478464277384241L;

	/** 
	 * 订单信息
若订单号或业务号存在，则返回
	 */
	@ApiField("order_info")
	private AlipayOrderDataOpenapiResultInfo orderInfo;

	public void setOrderInfo(AlipayOrderDataOpenapiResultInfo orderInfo) {
		this.orderInfo = orderInfo;
	}
	public AlipayOrderDataOpenapiResultInfo getOrderInfo( ) {
		return this.orderInfo;
	}

}
