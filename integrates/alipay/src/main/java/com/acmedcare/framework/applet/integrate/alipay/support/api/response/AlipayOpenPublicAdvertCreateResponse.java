package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicAdvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561113774769716118L;

	/** 
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}
	public String getAdvertId( ) {
		return this.advertId;
	}

}
