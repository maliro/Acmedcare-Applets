package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-删除用户标签
 *
 * @author auto create
 * @since 1.0, 2018-12-25 17:14:41
 */
public class AlipayOpenPublicLabelUserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8265253373543574962L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 支付宝用户的userid，2088开头长度为16位的字符串
	 */
	@ApiField("user_id")
	private String userId;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
