package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序结束灰度
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:14:50
 */
public class AlipayOpenMiniVersionGrayCancelModel extends AlipayObject {

	private static final long serialVersionUID = 7434817389955621719L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
