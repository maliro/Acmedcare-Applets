package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 借呗网商贷客群切分接口
 *
 * @author auto create
 * @since 1.0, 2018-11-28 18:06:04
 */
public class AlipayPcreditCreditriskCustlabelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7875934243275341548L;

	/**
	 * 支付宝2088id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}
