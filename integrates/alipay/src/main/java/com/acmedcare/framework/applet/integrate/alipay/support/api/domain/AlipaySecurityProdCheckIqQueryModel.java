package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 校验
 *
 * @author auto create
 * @since 1.0, 2019-09-17 17:03:19
 */
public class AlipaySecurityProdCheckIqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3698791658453932378L;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}
