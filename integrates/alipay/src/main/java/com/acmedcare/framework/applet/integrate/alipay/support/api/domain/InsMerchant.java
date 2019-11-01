package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 保险机构
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:11:17
 */
public class InsMerchant extends AlipayObject {

	private static final long serialVersionUID = 7682913195861339598L;

	/**
	 * 机构全称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 机构简称
	 */
	@ApiField("short_name")
	private String shortName;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
