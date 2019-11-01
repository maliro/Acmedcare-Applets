package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 服务商中心三方合作员工登录
 *
 * @author auto create
 * @since 1.0, 2018-06-07 15:34:59
 */
public class AlipayOpenOperationPartnerLoginCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5259336742472854476L;

	/**
	 * 三方合作服务商的员工支付宝UID，要求唯一。需要三方员工通过授权操作提供。
	 */
	@ApiField("staff_user_id")
	private String staffUserId;

	public String getStaffUserId() {
		return this.staffUserId;
	}
	public void setStaffUserId(String staffUserId) {
		this.staffUserId = staffUserId;
	}

}
