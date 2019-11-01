package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 行业通用扩展字段，用来支持通用接口的一些扩展属性的录入 。
 *
 * @author auto create
 * @since 1.0, 2018-09-14 14:28:37
 */
public class IndustryExtendField extends AlipayObject {

	private static final long serialVersionUID = 8591494177693559847L;

	/**
	 * 扩展参数的key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 扩展参数的value值
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
