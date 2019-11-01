package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * xuweibo测试api
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:00:46
 */
public class AlipayOpenAppXwbtstabcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5698671564522922179L;

	/**
	 * 1
	 */
	@ApiField("xwbaa")
	private String xwbaa;

	public String getXwbaa() {
		return this.xwbaa;
	}
	public void setXwbaa(String xwbaa) {
		this.xwbaa = xwbaa;
	}

}
