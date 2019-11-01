package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * riskprofile查询返回的键值对
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:17:44
 */
public class RiskProfileDto extends AlipayObject {

	private static final long serialVersionUID = 6713727257567762579L;

	/**
	 * risk profile名称和入参对应
	 */
	@ApiField("risk_profile")
	private String riskProfile;

	/**
	 * risk profile对应主体的分值
	 */
	@ApiField("value")
	private String value;

	public String getRiskProfile() {
		return this.riskProfile;
	}
	public void setRiskProfile(String riskProfile) {
		this.riskProfile = riskProfile;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
