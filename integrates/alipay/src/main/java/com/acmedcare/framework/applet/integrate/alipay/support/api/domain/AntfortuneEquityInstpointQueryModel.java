package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 财富开放机构积分查询
 *
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:22
 */
public class AntfortuneEquityInstpointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3661873277828875888L;

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
