package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-15 11:14:38
 */
public class AntMerchantExpandIndirectImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6272928675116567685L;

	/** 
	 * 图片在文件存储平台的标识
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
