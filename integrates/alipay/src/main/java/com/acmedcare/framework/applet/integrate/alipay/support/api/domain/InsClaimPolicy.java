package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 理赔报案时相关的保单信息
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:46:42
 */
public class InsClaimPolicy extends AlipayObject {

	private static final long serialVersionUID = 1186585161616943267L;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
