package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.account.rysenterprise.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankFinanceAccountRysenterpriseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7764395516467471951L;

	/** 
	 * 融易收账户Id
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 融易收账户可用余额
	 */
	@ApiField("amount")
	private String amount;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

}
