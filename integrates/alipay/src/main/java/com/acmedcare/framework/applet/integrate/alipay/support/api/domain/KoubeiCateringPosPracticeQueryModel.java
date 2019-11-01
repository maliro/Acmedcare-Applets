package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询门店做法列表
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:24:02
 */
public class KoubeiCateringPosPracticeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3624932856626277666L;

	/**
	 * 门店id
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
