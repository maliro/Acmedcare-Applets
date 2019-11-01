package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 二方登录token校验
 *
 * @author auto create
 * @since 1.0, 2019-07-16 19:52:31
 */
public class AlipayUserAuthSecondpartyTokenVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6229569941618542639L;

	/**
	 * 二方登录token
	 */
	@ApiField("second_party_token")
	private String secondPartyToken;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	public String getSecondPartyToken() {
		return this.secondPartyToken;
	}
	public void setSecondPartyToken(String secondPartyToken) {
		this.secondPartyToken = secondPartyToken;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
