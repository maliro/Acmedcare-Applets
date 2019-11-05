package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.text.voice.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:45
 */
public class AlipayEcoTextVoiceTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8159269192794249177L;

	/** 
	 * 阿里云语音编号
	 */
	@ApiField("call_id")
	private String callId;

	/** 
	 * 调用结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 调用结果描述
	 */
	@ApiField("message")
	private String message;

	public void setCallId(String callId) {
		this.callId = callId;
	}
	public String getCallId( ) {
		return this.callId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
