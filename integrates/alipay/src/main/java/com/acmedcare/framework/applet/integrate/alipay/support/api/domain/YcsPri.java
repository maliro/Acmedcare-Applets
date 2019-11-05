package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * aaa
 *
 * @author auto create
 * @since 1.0, 2018-10-15 15:11:15
 */
public class YcsPri extends AlipayObject {

	private static final long serialVersionUID = 7317571289111563587L;

	/**
	 * aaa
	 */
	@ApiField("a")
	private String a;

	/**
	 * 支持输入标准html超链接：<a href="url" target="_blank">Link text</a>例如：<a href="https://open.alipay.com" target="_blank">蚂蚁开放平台</a>
	 */
	@ApiField("b")
	private String b;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

}
