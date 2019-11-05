package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑菜品加料绑定菜品信息
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:36:27
 */
public class KbdishMaterialBindingInfo extends AlipayObject {

	private static final long serialVersionUID = 4555659324684932271L;

	/**
	 * 加料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 菜品加料排序字段，从1开始递增
	 */
	@ApiField("sort")
	private String sort;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
