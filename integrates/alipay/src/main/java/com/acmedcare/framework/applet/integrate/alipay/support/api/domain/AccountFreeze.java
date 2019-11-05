package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 支付宝用户冻结明细信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AccountFreeze extends AlipayObject {

	private static final long serialVersionUID = 3577193574155828624L;

	/**
	 * 冻结金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 冻结类型名称
	 */
	@ApiField("freeze_name")
	private String freezeName;

	/**
	 * 冻结类型值
	 */
	@ApiField("freeze_type")
	private String freezeType;

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getFreezeName() {
		return this.freezeName;
	}
	public void setFreezeName(String freezeName) {
		this.freezeName = freezeName;
	}

	public String getFreezeType() {
		return this.freezeType;
	}
	public void setFreezeType(String freezeType) {
		this.freezeType = freezeType;
	}

}
