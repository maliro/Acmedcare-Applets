package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.save response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataCustomreportSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835453962477417874L;

	/** 
	 * 自定义报表的规则ID
	 */
	@ApiField("condition_key")
	private String conditionKey;

	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}
	public String getConditionKey( ) {
		return this.conditionKey;
	}

}
