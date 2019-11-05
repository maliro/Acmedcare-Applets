package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * AssetSubFeedbackInfo 存放子信息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 17:06:19
 */
public class AssetSubFeedbackInfo extends AlipayObject {

	private static final long serialVersionUID = 7851668424973219557L;

	/**
	 * 返回的信息code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 返回值的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 具体的值，例如SN号
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
