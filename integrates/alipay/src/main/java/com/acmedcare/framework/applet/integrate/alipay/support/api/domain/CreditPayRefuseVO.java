package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 信用支付咨询拒绝详情视图
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:15
 */
public class CreditPayRefuseVO extends AlipayObject {

	private static final long serialVersionUID = 4246499199617217689L;

	/**
	 * 拒绝码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 拒绝详情
	 */
	@ApiField("msg")
	private String msg;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
