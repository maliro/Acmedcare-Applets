package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cert.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignCertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381535298427979538L;

	/** 
	 * 凭证id
	 */
	@ApiField("lot_number")
	private String lotNumber;

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getLotNumber( ) {
		return this.lotNumber;
	}

}
