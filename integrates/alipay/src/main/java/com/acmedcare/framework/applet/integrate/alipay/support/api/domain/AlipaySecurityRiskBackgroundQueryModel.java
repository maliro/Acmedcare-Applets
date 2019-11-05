package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 人员风险背景调查
 *
 * @author auto create
 * @since 1.0, 2017-05-31 19:27:57
 */
public class AlipaySecurityRiskBackgroundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3441949431387585747L;

	/**
	 * params+用于背调查询的输入信息+用户传入
	 */
	@ApiField("params")
	private String params;

	/**
	 * partner_name+唯一+作为标识调用者身份的字段+用户填入
	 */
	@ApiField("partner_name")
	private String partnerName;

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
