package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-09 11:16:24
 */
public class AlipayPcreditHuabeiDiscountSolutionModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8186272668681426347L;

	/** 
	 * success，是否更新成功，true成功，false失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
