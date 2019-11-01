package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:12:56
 */
public class AlipayCommerceIotAdvertiserMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3739629754251731547L;

	/** 
	 * 物料id
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 物料http地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	public String getMaterialUrl( ) {
		return this.materialUrl;
	}

}
