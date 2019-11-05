package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot进件申请单关联设备查询接口
 *
 * @author auto create
 * @since 1.0, 2019-08-21 12:16:29
 */
public class AlipayCommerceIotDapplyOrderdeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1779739674732883916L;

	/**
	 * 进件申请单号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

}
