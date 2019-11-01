package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序功能服务poi查询
 *
 * @author auto create
 * @since 1.0, 2019-08-01 20:34:59
 */
public class AlipayOpenAppServiceMiniappnearbyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3442726818297273395L;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
