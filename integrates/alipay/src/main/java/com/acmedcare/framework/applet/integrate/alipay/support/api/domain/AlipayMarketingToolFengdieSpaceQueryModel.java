package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询云凤蝶空间详情
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:20
 */
public class AlipayMarketingToolFengdieSpaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7533319227716317381L;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲查询的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}