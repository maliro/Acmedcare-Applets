package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.contract.sign response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-17 20:43:12
 */
public class MybankCreditGuaranteeContractSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7342882184481865578L;

	/** 
	 * 合约号。调用成功则返回签约合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	public void setArNo(String arNo) {
		this.arNo = arNo;
	}
	public String getArNo( ) {
		return this.arNo;
	}

}
