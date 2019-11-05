package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * K-V键值对
 *
 * @author auto create
 * @since 1.0, 2019-02-19 17:19:59
 */
public class KeyValuePair extends AlipayObject {

	private static final long serialVersionUID = 8675844261423258666L;

	/**
	 * key
	 */
	@ApiField("key")
	private String key;

	/**
	 * value
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
