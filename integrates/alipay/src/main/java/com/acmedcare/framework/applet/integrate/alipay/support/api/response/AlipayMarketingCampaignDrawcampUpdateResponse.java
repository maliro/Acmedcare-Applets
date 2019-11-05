package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.update response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingCampaignDrawcampUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6429217454252652736L;

	/** 
	 * 操作结果状态，true表示修改成功立即生效，false表示修改失败
	 */
	@ApiField("camp_result")
	private Boolean campResult;

	public void setCampResult(Boolean campResult) {
		this.campResult = campResult;
	}
	public Boolean getCampResult( ) {
		return this.campResult;
	}

}
