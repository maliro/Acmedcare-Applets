package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.reconfirm.verificatecallback.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-16 17:20:04
 */
public class AlipaySecurityRiskReconfirmVerificatecallbackSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3165154122451934676L;

	/** 
	 * 额外返回信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

}
