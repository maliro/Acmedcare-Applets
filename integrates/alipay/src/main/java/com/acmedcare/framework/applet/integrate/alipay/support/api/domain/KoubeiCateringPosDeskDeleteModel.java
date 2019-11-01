package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 删除桌台
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:25:38
 */
public class KoubeiCateringPosDeskDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4321467544892374321L;

	/**
	 * 桌位Id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
