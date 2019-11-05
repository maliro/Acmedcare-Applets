package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 11:20:56
 */
public class AlipayEcoMycarImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7534994839864755314L;

	/** 
	 * 图片Id
	 */
	@ApiField("img_id")
	private String imgId;

	/** 
	 * 图片地址，url全是小写
	 */
	@ApiField("img_url")
	private String imgUrl;

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}
	public String getImgId( ) {
		return this.imgId;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgUrl( ) {
		return this.imgUrl;
	}

}
