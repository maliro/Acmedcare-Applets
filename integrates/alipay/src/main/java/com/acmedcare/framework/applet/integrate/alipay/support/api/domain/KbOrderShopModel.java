package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑在线购买订单-购买店铺模型
 *
 * @author auto create
 * @since 1.0, 2017-09-27 10:56:59
 */
public class KbOrderShopModel extends AlipayObject {

	private static final long serialVersionUID = 3641948377699851119L;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 00007
	 */
	@ApiField("store_id")
	private String storeId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
