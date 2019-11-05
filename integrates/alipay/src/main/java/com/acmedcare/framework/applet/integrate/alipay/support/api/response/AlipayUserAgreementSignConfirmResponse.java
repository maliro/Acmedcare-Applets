package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.sign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-15 10:45:13
 */
public class AlipayUserAgreementSignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2448152979314397787L;

	/** 
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 是否海外购汇身份。值：T/F
	 */
	@ApiField("forex_eligible")
	private String forexEligible;

	/** 
	 * 协议的当前状态。
1. TEMP：暂存，协议未生效过；
2. NORMAL：正常；
3. STOP：暂停。
	 */
	@ApiField("status")
	private String status;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setForexEligible(String forexEligible) {
		this.forexEligible = forexEligible;
	}
	public String getForexEligible( ) {
		return this.forexEligible;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
