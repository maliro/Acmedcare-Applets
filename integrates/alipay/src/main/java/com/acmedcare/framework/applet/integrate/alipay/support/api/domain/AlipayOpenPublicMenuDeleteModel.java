package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 默认菜单删除
 *
 * @author auto create
 * @since 1.0, 2018-04-27 10:59:29
 */
public class AlipayOpenPublicMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2775211836912439969L;

	/**
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

	public String getMenuKey() {
		return this.menuKey;
	}
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

}
