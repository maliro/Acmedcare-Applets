package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.prepayment.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditSupplychainPrepaymentApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7317486589619871312L;

	/** 
	 * 预付申请单编号。
	 */
	@ApiField("prepayment_apply_no")
	private String prepaymentApplyNo;

	public void setPrepaymentApplyNo(String prepaymentApplyNo) {
		this.prepaymentApplyNo = prepaymentApplyNo;
	}
	public String getPrepaymentApplyNo( ) {
		return this.prepaymentApplyNo;
	}

}
