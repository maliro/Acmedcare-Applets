package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 模板使用信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 19:33:59
 */
public class TemplateUsageInfo extends AlipayObject {

	private static final long serialVersionUID = 7646611745224244382L;

	/**
	 * 商家小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 商家小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
