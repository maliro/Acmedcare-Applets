package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.forest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCharityForestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7212858963579233154L;

	/** 
	 * 是否开通了蚂蚁森林
	 */
	@ApiField("forest_user")
	private Boolean forestUser;

	public void setForestUser(Boolean forestUser) {
		this.forestUser = forestUser;
	}
	public Boolean getForestUser( ) {
		return this.forestUser;
	}

}
