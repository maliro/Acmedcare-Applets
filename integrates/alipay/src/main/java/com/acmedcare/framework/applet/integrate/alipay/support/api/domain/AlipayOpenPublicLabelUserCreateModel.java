package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 用户增加标签接口
 *
 * @author auto create
 * @since 1.0, 2018-12-25 17:14:51
 */
public class AlipayOpenPublicLabelUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2323125526767353695L;

	/**
	 * 要绑定的标签Id
	 */
	@ApiField("label_id")
	private Long labelId;

	/**
	 * 支付宝用户id，2088开头长度为16位的字符串
	 */
	@ApiField("user_id")
	private String userId;

	public Long getLabelId() {
		return this.labelId;
	}
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
