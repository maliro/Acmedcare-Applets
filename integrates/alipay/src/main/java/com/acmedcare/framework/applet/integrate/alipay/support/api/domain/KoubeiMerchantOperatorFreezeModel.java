package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 锁定操作员
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:19
 */
public class KoubeiMerchantOperatorFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 4518221189338136282L;

	/**
	 * 操作码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
