package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 根据条形码获取抬头
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:01:19
 */
public class AlipayEbppInvoiceTitleDynamicGetModel extends AlipayObject {

	private static final long serialVersionUID = 1191748825276477464L;

	/**
	 * 抬头动态码
	 */
	@ApiField("bar_code")
	private String barCode;

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
