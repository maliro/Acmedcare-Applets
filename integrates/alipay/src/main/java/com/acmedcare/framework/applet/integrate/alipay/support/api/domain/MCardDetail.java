package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商户储值卡信息
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:31:32
 */
public class MCardDetail extends AlipayObject {

	private static final long serialVersionUID = 4155217829244487538L;

	/**
	 * 储值卡可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 储值卡名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 储值卡支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

}
