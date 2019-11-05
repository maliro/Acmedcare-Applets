package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.loan.close response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCreditAutofinanceLoanCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4296175243486566834L;

	/** 
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("outorderno")
	private String outorderno;

	public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}
	public String getOutorderno( ) {
		return this.outorderno;
	}

}
