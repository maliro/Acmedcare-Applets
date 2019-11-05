package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoMycarMaintainShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1537139267877858717L;

	/** 
	 * 车主平台创建的门店编号
	 */
	@ApiField("shop_id")
	private Long shopId;

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getShopId( ) {
		return this.shopId;
	}

}
