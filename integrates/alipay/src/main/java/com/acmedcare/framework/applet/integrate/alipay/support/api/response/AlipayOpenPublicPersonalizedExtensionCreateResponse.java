package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicPersonalizedExtensionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6872463953325728281L;

	/** 
	 * 扩展区套id，创建个性化扩展区成功后，支付宝会将该字段返回，后续扩展区上下线或者扩展区删除都会用到这个值。
	 */
	@ApiField("extension_key")
	private String extensionKey;

	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}
	public String getExtensionKey( ) {
		return this.extensionKey;
	}

}
