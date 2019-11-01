package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 授权协议
 *
 * @author auto create
 * @since 1.0, 2018-12-18 16:39:10
 */
public class Agreement extends AlipayObject {

	private static final long serialVersionUID = 1371869766147879121L;

	/**
	 * 协议地址
	 */
	@ApiField("link")
	private String link;

	/**
	 * 协议名称
	 */
	@ApiField("name")
	private String name;

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
