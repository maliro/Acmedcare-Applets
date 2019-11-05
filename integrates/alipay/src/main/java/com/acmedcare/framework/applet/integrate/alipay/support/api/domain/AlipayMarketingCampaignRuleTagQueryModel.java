package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 圈人标签查询
 *
 * @author auto create
 * @since 1.0, 2018-10-17 14:07:55
 */
public class AlipayMarketingCampaignRuleTagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2638845526236963249L;

	/**
	 * 签约商户下属机构唯一编号
	 */
	@ApiField("mpid")
	private String mpid;

	public String getMpid() {
		return this.mpid;
	}
	public void setMpid(String mpid) {
		this.mpid = mpid;
	}

}
