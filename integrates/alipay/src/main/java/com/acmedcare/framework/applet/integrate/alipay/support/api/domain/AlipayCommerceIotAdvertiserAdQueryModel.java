package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商家查询自运营计划列表
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:11
 */
public class AlipayCommerceIotAdvertiserAdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4594296851363756125L;

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
