package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品扩展信息KV对象
 *
 * @author auto create
 * @since 1.0, 2019-09-06 10:27:32
 */
public class ItemExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1583192175132662261L;

	/**
	 * 扩展信息的key
	 */
	@ApiField("ext_key")
	private String extKey;

	/**
	 * 扩展信息的值
	 */
	@ApiField("ext_value")
	private String extValue;

	public String getExtKey() {
		return this.extKey;
	}
	public void setExtKey(String extKey) {
		this.extKey = extKey;
	}

	public String getExtValue() {
		return this.extValue;
	}
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}

}
