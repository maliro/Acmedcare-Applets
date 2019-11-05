package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 监控共建自定义指标维度
 *
 * @author auto create
 * @since 1.0, 2019-02-15 20:05:22
 */
public class Dimension extends AlipayObject {

	private static final long serialVersionUID = 5269233834182962551L;

	/**
	 * 维度类型
	 */
	@ApiField("name")
	private String name;

	/**
	 * 维度值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
