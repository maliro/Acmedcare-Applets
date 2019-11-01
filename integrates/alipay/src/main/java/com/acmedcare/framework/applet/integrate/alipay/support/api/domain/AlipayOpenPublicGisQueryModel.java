package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 获取用户地理位置
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:54:47
 */
public class AlipayOpenPublicGisQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3192687744865798863L;

	/**
	 * 该用户的userId
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
