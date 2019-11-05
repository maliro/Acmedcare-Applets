package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑物流单取消
 *
 * @author auto create
 * @since 1.0, 2019-09-03 00:07:56
 */
public class KoubeiTradeKbdeliveryDeliveryCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5815928793924623825L;

	/**
	 * 口碑物流单，单号；
需要撤销的单据号
	 */
	@ApiField("logistics_order_no")
	private String logisticsOrderNo;

	/**
	 * 关闭物流订单原因
	 */
	@ApiField("reason")
	private String reason;

	public String getLogisticsOrderNo() {
		return this.logisticsOrderNo;
	}
	public void setLogisticsOrderNo(String logisticsOrderNo) {
		this.logisticsOrderNo = logisticsOrderNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
