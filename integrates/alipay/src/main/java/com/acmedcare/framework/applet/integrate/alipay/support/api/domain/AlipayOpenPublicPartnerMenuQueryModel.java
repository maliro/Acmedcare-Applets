package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 为服务窗合作伙伴（如YunOS），提供查询所有服务窗的菜单的功能
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:54:17
 */
public class AlipayOpenPublicPartnerMenuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4537114512867641343L;

	/**
	 * 服务窗id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
