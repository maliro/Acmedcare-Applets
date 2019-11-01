package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.WhitehatInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.afsrc.whitehatinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdAfsrcWhitehatinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8466323476924629829L;

	/** 
	 * 白帽子信息
	 */
	@ApiField("data")
	private WhitehatInfo data;

	public void setData(WhitehatInfo data) {
		this.data = data;
	}
	public WhitehatInfo getData( ) {
		return this.data;
	}

}
