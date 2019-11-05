package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.widget.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-30 19:46:35
 */
public class MybankCreditCreditriskWidgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6467182692297523547L;

	/** 
	 * widget json数据
	 */
	@ApiField("widgetjson")
	private String widgetjson;

	public void setWidgetjson(String widgetjson) {
		this.widgetjson = widgetjson;
	}
	public String getWidgetjson( ) {
		return this.widgetjson;
	}

}
