package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 现金活动详情查询
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:35
 */
public class AlipayMarketingCampaignCashDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2759665865737284757L;

	/**
	 * 要查询的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
