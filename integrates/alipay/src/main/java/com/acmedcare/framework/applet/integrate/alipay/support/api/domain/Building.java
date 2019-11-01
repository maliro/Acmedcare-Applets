package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 建筑信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:31:49
 */
public class Building extends AlipayObject {

	private static final long serialVersionUID = 2662765963513766649L;

	/**
	 * 建筑名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * POI类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
