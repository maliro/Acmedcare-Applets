package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 取消投放计划
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:12:21
 */
public class AlipayCommerceIotAdvertiserAdCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2149287817223471898L;

	/**
	 * 投放计划id
	 */
	@ApiField("id")
	private Long id;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
