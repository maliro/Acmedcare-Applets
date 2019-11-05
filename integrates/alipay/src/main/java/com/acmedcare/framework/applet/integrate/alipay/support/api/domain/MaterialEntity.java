package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 配料列表返回对象
 *
 * @author auto create
 * @since 1.0, 2018-11-21 14:21:03
 */
public class MaterialEntity extends AlipayObject {

	private static final long serialVersionUID = 4647771688645375787L;

	/**
	 * 配料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 配料名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 加价金额
	 */
	@ApiField("sell_price")
	private String sellPrice;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

}
