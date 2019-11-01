package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 删除已联普遍二维码
 *
 * @author auto create
 * @since 1.0, 2019-09-23 10:46:46
 */
public class AlipayOpenMiniQrcodeUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 4158197334473723797L;

	/**
	 * 路由规则组，用于唯一标记一条路由规则
	 */
	@ApiField("route_group")
	private String routeGroup;

	public String getRouteGroup() {
		return this.routeGroup;
	}
	public void setRouteGroup(String routeGroup) {
		this.routeGroup = routeGroup;
	}

}
