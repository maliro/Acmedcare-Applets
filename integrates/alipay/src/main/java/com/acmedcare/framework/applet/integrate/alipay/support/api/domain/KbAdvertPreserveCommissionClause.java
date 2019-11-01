package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 专属领取人员
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */
public class KbAdvertPreserveCommissionClause extends AlipayObject {

	private static final long serialVersionUID = 6811423652467389536L;

	/**
	 * user_id：支付宝账户ID(2088开头)
logon_id：登陆账号
	 */
	@ApiField("claimer_id_type")
	private String claimerIdType;

	/**
	 * 认领人
	 */
	@ApiListField("claimers")
	@ApiField("string")
	private List<String> claimers;

	public String getClaimerIdType() {
		return this.claimerIdType;
	}
	public void setClaimerIdType(String claimerIdType) {
		this.claimerIdType = claimerIdType;
	}

	public List<String> getClaimers() {
		return this.claimers;
	}
	public void setClaimers(List<String> claimers) {
		this.claimers = claimers;
	}

}
