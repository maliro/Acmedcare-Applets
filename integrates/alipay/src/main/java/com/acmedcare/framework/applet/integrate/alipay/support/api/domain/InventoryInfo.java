package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 押品资产信息描述
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:44:32
 */
public class InventoryInfo extends AlipayObject {

	private static final long serialVersionUID = 3515822138732388411L;

	/**
	 * 资产数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 资产类型id编号
	 */
	@ApiField("sku_id")
	private String skuId;

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
