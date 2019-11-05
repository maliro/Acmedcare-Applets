package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询用户是否已收藏调用者的小程序
 *
 * @author auto create
 * @since 1.0, 2019-01-11 19:07:37
 */
public class AlipayOpenMiniMiniappFavoriteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4875231334248989537L;

	/**
	 * 需要指定查询收藏的app_id，若开放平台分配的app_id与具体的小程序不同时，才需要传参
	 */
	@ApiField("designated_app_id")
	private String designatedAppId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getDesignatedAppId() {
		return this.designatedAppId;
	}
	public void setDesignatedAppId(String designatedAppId) {
		this.designatedAppId = designatedAppId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
