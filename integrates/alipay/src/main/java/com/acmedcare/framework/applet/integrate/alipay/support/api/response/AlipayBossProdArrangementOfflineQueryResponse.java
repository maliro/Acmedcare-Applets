package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.arrangement.offline.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayBossProdArrangementOfflineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1778628456857991652L;

	/** 
	 * 商户的签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
