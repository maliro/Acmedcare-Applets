package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.crowd.wshop.match response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntfortuneMarketingCrowdWshopMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6484778423913863978L;

	/** 
	 * 用户是否匹配人群，枚举值：true/false
	 */
	@ApiField("match_result")
	private Boolean matchResult;

	public void setMatchResult(Boolean matchResult) {
		this.matchResult = matchResult;
	}
	public Boolean getMatchResult( ) {
		return this.matchResult;
	}

}
