package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 校园卡查询
 *
 * @author auto create
 * @since 1.0, 2019-04-12 15:41:58
 */
public class AlipayCommerceEducateCampuscardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6814634814355177452L;

	/**
	 * 支付宝用户ID
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
