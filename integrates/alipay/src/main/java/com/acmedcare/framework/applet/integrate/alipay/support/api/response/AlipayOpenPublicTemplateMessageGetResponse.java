package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.template.message.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-10 13:40:25
 */
public class AlipayOpenPublicTemplateMessageGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6792672537153466716L;

	/** 
	 * 消息模板id--商户领取母版后生成的唯一模板id
	 */
	@ApiField("msg_template_id")
	private String msgTemplateId;

	/** 
	 * 模板内容
	 */
	@ApiField("template")
	private String template;

	public void setMsgTemplateId(String msgTemplateId) {
		this.msgTemplateId = msgTemplateId;
	}
	public String getMsgTemplateId( ) {
		return this.msgTemplateId;
	}

	public void setTemplate(String template) {
		this.template = template;
	}
	public String getTemplate( ) {
		return this.template;
	}

}
