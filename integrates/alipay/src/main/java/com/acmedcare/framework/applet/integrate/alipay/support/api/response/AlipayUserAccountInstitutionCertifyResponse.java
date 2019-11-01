package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.institution.certify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-04 11:09:21
 */
public class AlipayUserAccountInstitutionCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6323564426838946162L;

	/** 
	 * 机构是否存在的标示
如果此机构存在，exist返回值为T
如果此机构不存在，exist返回为F
	 */
	@ApiField("match")
	private String match;

	/** 
	 * 该帐号对应的uid
	 */
	@ApiField("user_id")
	private String userId;

	public void setMatch(String match) {
		this.match = match;
	}
	public String getMatch( ) {
		return this.match;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
