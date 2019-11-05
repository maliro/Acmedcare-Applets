package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询支付方式列表
 *
 * @author auto create
 * @since 1.0, 2019-01-16 17:31:19
 */
public class KoubeiCateringPosPaymodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4858847217238173747L;

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
