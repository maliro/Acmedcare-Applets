package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.material.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-15 10:09:02
 */
public class AlipayMarketingMaterialImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7442348838351744333L;

	/** 
	 * 图片唯一资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceId( ) {
		return this.resourceId;
	}

}
