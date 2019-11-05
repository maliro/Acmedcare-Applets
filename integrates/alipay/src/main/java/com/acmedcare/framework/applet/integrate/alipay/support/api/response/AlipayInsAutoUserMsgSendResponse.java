package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-12 14:45:00
 */
public class AlipayInsAutoUserMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5519697213292967867L;

	/** 
	 * 描述是否可以重试
	 */
	@ApiField("can_retry")
	private Boolean canRetry;

	public void setCanRetry(Boolean canRetry) {
		this.canRetry = canRetry;
	}
	public Boolean getCanRetry( ) {
		return this.canRetry;
	}

}
