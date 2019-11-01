package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.reservation.isvorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-07 14:45:52
 */
public class KoubeiServindustryReservationIsvorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3395696224639732297L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 表示接收成功或失败
	 */
	@ApiField("success")
	private String success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
