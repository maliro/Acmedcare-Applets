package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.Date;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.executionplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-15 10:44:40
 */
public class AlipayUserAgreementExecutionplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2787157861535473149L;

	/** 
	 * 周期性扣款产品，授权免密支付协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 商户下一次扣款时间
	 */
	@ApiField("deduct_time")
	private Date deductTime;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setDeductTime(Date deductTime) {
		this.deductTime = deductTime;
	}
	public Date getDeductTime( ) {
		return this.deductTime;
	}

}
