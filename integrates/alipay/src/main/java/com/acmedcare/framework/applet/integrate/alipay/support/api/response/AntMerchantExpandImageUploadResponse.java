package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntMerchantExpandImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2298977731668455986L;

	/** 
	 * 图片在sfs中的标识
	 */
	@ApiField("image_id")
	private String imageId;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

}
