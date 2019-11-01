package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询千牛网商有数widget的数据
 *
 * @author auto create
 * @since 1.0, 2017-09-12 12:15:08
 */
public class MybankCreditCreditriskWidgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1596721338756853494L;

	/**
	 * 支付宝userid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}
