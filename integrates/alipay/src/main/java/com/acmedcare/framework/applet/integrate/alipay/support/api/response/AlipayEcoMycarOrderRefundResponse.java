package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoMycarOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4513642612877838717L;

	/** 
	 * 失败原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 是否成功(T: 成功，F:失败)
	 */
	@ApiField("success")
	private String success;

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
