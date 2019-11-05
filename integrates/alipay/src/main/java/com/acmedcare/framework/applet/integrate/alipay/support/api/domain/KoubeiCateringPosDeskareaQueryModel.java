package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 餐区查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:03
 */
public class KoubeiCateringPosDeskareaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1474236281581587453L;

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
