package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 删除配料
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:22:49
 */
public class KoubeiCateringPosMaterialDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4273726777529959863L;

	/**
	 * 配料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
