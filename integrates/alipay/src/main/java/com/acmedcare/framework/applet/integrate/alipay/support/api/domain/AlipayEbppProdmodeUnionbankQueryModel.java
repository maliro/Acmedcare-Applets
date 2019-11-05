package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 联行信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:50
 */
public class AlipayEbppProdmodeUnionbankQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6844325669611324669L;

	/**
	 * 银联编号
	 */
	@ApiField("bank_code")
	private String bankCode;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

}
