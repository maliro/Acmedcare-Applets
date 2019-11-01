package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 会员权益信息
 *
 * @author auto create
 * @since 1.0, 2019-03-29 22:01:16
 */
public class MemberBenefitInfo extends AlipayObject {

	private static final long serialVersionUID = 8893366184334985777L;

	/**
	 * 权益对应跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 权益图标地址
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 会员权益标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 权益价值
	 */
	@ApiField("value")
	private String value;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
