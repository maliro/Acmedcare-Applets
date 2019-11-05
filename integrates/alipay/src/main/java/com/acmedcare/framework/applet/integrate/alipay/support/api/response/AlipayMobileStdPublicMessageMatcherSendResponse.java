package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.message.matcher.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileStdPublicMessageMatcherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7664528696382727596L;

	/** 
	 * 对应toUserId，标准Alipay UserId
	 */
	@ApiField("to_alipay_user_id")
	private String toAlipayUserId;

	/** 
	 * 消息接收人的用户ID，值取的openId
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public void setToAlipayUserId(String toAlipayUserId) {
		this.toAlipayUserId = toAlipayUserId;
	}
	public String getToAlipayUserId( ) {
		return this.toAlipayUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	public String getToUserId( ) {
		return this.toUserId;
	}

}
