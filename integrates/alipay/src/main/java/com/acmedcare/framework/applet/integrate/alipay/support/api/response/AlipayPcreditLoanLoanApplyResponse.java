package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.loan.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1343443858774985231L;

	/** 
	 * 贷款申请受理单号
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/** 
	 * 跳转至支付宝地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}
	public String getApplyReceiptNo( ) {
		return this.applyReceiptNo;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
