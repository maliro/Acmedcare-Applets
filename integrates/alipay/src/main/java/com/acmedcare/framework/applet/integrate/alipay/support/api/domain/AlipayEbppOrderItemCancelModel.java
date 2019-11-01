package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 行业支付订单子项删除接口
 *
 * @author auto create
 * @since 1.0, 2018-12-20 19:38:25
 */
public class AlipayEbppOrderItemCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2262915417464629562L;

	/**
	 * 机构订单子项id
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
