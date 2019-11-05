package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商户增加的自定义菜单内容
 *
 * @author auto create
 * @since 1.0, 2016-09-23 09:25:03
 */
public class PrizeCustomMenu extends AlipayObject {

	private static final long serialVersionUID = 1539677881921546513L;

	/**
	 * 菜单详情
	 */
	@ApiField("text")
	private String text;

	/**
	 * 菜单名称
	 */
	@ApiField("title")
	private String title;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
