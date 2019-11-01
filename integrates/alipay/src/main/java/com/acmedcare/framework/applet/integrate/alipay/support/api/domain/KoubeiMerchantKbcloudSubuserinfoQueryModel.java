package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询口碑子账户信息列表
 *
 * @author auto create
 * @since 1.0, 2018-11-19 18:09:45
 */
public class KoubeiMerchantKbcloudSubuserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3369686964881636385L;

	/**
	 * 主账号ID
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
