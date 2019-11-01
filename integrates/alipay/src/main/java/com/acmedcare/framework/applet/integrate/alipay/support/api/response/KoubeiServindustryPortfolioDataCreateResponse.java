package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.data.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiServindustryPortfolioDataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1772757833498874235L;

	/** 
	 * 作品集ID
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}
	public String getPortfolioId( ) {
		return this.portfolioId;
	}

}
