package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 判断是否旺铺
 *
 * @author auto create
 * @since 1.0, 2018-11-29 14:40:40
 */
public class KoubeiServindustryReservationPayshopIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7671754822529219536L;

	/**
	 * 店铺id
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
