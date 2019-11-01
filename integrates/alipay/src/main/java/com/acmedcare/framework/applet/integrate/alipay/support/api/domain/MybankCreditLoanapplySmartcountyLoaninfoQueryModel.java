package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户网商贷信息-智慧县域小程序专用
 *
 * @author auto create
 * @since 1.0, 2019-07-30 16:18:59
 */
public class MybankCreditLoanapplySmartcountyLoaninfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1542474866184366423L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
