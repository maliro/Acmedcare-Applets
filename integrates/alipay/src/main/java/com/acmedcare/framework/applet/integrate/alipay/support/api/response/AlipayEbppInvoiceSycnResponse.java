package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.sycn response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-17 09:53:38
 */
public class AlipayEbppInvoiceSycnResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448674384999958157L;

	/** 
	 * 支付宝发票管家发票详情页链接地址
如果同步的发票是多张时，此链接为当前用户的已开立发票列表地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
