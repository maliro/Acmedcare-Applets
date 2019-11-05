package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑会员授权
 *
 * @author auto create
 * @since 1.0, 2019-03-06 15:53:38
 */
public class KoubeiMarketingCampaignMemberAuthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8832329144542527164L;

	/**
	 * token
	 */
	@ApiField("auth_token")
	private String authToken;

	public String getAuthToken() {
		return this.authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

}
