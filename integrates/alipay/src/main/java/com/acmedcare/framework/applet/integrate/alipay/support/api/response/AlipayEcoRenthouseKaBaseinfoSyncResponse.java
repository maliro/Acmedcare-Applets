package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.ka.baseinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoRenthouseKaBaseinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7428218131122223346L;

	/** 
	 * 返回kaCode唯一标识,用户查询ka信息时候用
	 */
	@ApiField("ka_code")
	private String kaCode;

	public void setKaCode(String kaCode) {
		this.kaCode = kaCode;
	}
	public String getKaCode( ) {
		return this.kaCode;
	}

}
