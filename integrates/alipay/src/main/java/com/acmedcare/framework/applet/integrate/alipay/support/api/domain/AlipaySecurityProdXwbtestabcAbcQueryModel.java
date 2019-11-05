package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * xuwebio测试用
 *
 * @author auto create
 * @since 1.0, 2017-11-17 10:59:46
 */
public class AlipaySecurityProdXwbtestabcAbcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6584649543998514286L;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

	public String getXwb() {
		return this.xwb;
	}
	public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
