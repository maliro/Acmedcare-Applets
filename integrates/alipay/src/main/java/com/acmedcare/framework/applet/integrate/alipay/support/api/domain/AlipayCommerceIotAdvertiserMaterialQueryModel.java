package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物料查询
 *
 * @author auto create
 * @since 1.0, 2019-08-13 17:11:16
 */
public class AlipayCommerceIotAdvertiserMaterialQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3497363162161121595L;

	/**
	 * 物料id
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
