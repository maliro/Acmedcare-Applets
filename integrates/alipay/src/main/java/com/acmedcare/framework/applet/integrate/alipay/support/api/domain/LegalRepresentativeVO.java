package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 法定负责人信息
 *
 * @author auto create
 * @since 1.0, 2019-01-22 14:29:59
 */
public class LegalRepresentativeVO extends AlipayObject {

	private static final long serialVersionUID = 7636929318372221984L;

	/**
	 * 职务
	 */
	@ApiField("duty")
	private String duty;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	public String getDuty() {
		return this.duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
