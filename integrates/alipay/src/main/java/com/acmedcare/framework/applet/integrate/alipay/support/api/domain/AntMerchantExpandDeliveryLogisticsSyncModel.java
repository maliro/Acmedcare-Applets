package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 物流信息同步接口
 *
 * @author auto create
 * @since 1.0, 2019-05-15 14:38:02
 */
public class AntMerchantExpandDeliveryLogisticsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1567352998857781516L;

	/**
	 * 配送指令
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 物流信息
	 */
	@ApiField("logistics_info")
	private LogisticsInfo logisticsInfo;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public LogisticsInfo getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(LogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

}
