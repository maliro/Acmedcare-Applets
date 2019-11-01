package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 行业订单批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-12-20 19:38:10
 */
public class AlipayEbppOrderItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3291296483345622775L;

	/**
	 * 机构端订单项id列表
	 */
	@ApiField("inst_item_id")
	private String instItemId;

	public String getInstItemId() {
		return this.instItemId;
	}
	public void setInstItemId(String instItemId) {
		this.instItemId = instItemId;
	}

}
