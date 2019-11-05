package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 应用授权文案查询
 *
 * @author auto create
 * @since 1.0, 2018-12-18 16:39:10
 */
public class AlipayOpenAuthAppContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5827412938114268247L;

	/**
	 * 授权场景，固定值PLATFORM_APP_AUTH
	 */
	@ApiField("auth_scene")
	private String authScene;

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

}
