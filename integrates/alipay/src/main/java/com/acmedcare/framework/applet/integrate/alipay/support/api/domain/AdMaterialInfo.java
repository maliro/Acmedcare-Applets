package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 单条物料数据
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:12:31
 */
public class AdMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 5885832342224696429L;

	/**
	 * 物料id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 物料地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMaterialUrl() {
		return this.materialUrl;
	}
	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}

}
