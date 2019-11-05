package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物流单状态查询
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:06
 */
public class KoubeiRetailWmsDeliveryorderprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5672433461953157177L;

	/**
	 * 通知单id
	 */
	@ApiField("notice_order_id")
	private String noticeOrderId;

	public String getNoticeOrderId() {
		return this.noticeOrderId;
	}
	public void setNoticeOrderId(String noticeOrderId) {
		this.noticeOrderId = noticeOrderId;
	}

}
