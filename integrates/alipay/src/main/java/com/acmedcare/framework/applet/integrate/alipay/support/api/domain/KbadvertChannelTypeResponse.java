package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 渠道类型配置
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:20
 */
public class KbadvertChannelTypeResponse extends AlipayObject {

	private static final long serialVersionUID = 3872453352324564897L;

	/**
	 * 渠道描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 排序，暂时无用
	 */
	@ApiField("order")
	private String order;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOrder() {
		return this.order;
	}
	public void setOrder(String order) {
		this.order = order;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
