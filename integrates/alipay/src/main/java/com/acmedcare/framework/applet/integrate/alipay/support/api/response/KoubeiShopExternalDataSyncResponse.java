package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.external.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiShopExternalDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4477114616748646694L;

	/** 
	 * 流水结果描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 申请流水Id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 流水处理成功
SUCESS(成功)
PROCESS(处理中)
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
