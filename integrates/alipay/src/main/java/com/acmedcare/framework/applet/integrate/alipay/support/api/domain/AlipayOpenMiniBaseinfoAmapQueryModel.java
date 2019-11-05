package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 提供给高德查询小程序基本信息
 *
 * @author auto create
 * @since 1.0, 2018-12-28 00:02:46
 */
public class AlipayOpenMiniBaseinfoAmapQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8189689921848178231L;

	/**
	 * 小程序应用id
	 */
	@ApiField("appid")
	private String appid;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

}
