package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 视觉货柜机型查询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 15:29:10
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinetypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5664888764137732646L;

	/**
	 * 类型(0:商品库机型, 1:摆放模板机型)
	 */
	@ApiField("type")
	private Long type;

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
