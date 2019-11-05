package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 蚂蚁宝卡联通流量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-03 12:25:27
 */
public class AlipayUserUnicomDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5116633291524225616L;

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
