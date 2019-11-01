package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 规格查询
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:26:13
 */
public class KoubeiCateringPosSpecQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2473446187692443333L;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
