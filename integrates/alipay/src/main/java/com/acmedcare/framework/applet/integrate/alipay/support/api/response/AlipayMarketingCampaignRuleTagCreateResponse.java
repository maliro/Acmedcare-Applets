package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.tag.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignRuleTagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2878292741347574115L;

	/** 
	 * 自定义标签id（创建自定义规则时提供）
	 */
	@ApiField("customertag")
	private String customertag;

	public void setCustomertag(String customertag) {
		this.customertag = customertag;
	}
	public String getCustomertag( ) {
		return this.customertag;
	}

}
