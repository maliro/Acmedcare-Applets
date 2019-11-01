package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询地理围栏信息
 *
 * @author auto create
 * @since 1.0, 2019-09-20 12:10:38
 */
public class AlipayCommerceIotDeviceGeofenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2366827617296226396L;

	/**
	 * 一组地理围栏的唯一标识, 通常一条公交线路.
	 */
	@ApiField("route_code")
	private String routeCode;

	public String getRouteCode() {
		return this.routeCode;
	}
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

}
