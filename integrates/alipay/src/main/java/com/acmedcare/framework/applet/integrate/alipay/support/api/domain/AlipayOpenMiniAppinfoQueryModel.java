package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询应用的基本信息
 *
 * @author auto create
 * @since 1.0, 2019-07-26 17:25:05
 */
public class AlipayOpenMiniAppinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1846749823323342827L;

	/**
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 应用类型（MINIAPP-小程序，LIEFAPP-生活号）
	 */
	@ApiField("open_app_type")
	private String openAppType;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getOpenAppType() {
		return this.openAppType;
	}
	public void setOpenAppType(String openAppType) {
		this.openAppType = openAppType;
	}

}
