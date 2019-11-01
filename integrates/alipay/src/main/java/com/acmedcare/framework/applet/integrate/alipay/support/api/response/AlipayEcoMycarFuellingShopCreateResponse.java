package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.fuelling.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoMycarFuellingShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8618295538357269338L;

	/** 
	 * 车主平台内部门店编号,系统唯一，ISV应保存好该标识
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
