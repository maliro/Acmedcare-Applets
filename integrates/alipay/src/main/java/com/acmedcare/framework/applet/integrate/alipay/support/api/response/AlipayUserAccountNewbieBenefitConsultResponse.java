package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AntMemberBenefitInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.newbie.benefit.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-30 15:57:26
 */
public class AlipayUserAccountNewbieBenefitConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6616421964898789941L;

	/** 
	 * 脱敏后的支付宝登录号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 权益信息
	 */
	@ApiField("benefit_info")
	private AntMemberBenefitInfo benefitInfo;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 成功
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 本次请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setBenefitInfo(AntMemberBenefitInfo benefitInfo) {
		this.benefitInfo = benefitInfo;
	}
	public AntMemberBenefitInfo getBenefitInfo( ) {
		return this.benefitInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}