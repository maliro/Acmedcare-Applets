package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseChatMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5111233118477148552L;

	/** 
	 * 消息索引号 会话ID_消息ID
	 */
	@ApiField("msg_index")
	private String msgIndex;

	public void setMsgIndex(String msgIndex) {
		this.msgIndex = msgIndex;
	}
	public String getMsgIndex( ) {
		return this.msgIndex;
	}

}
