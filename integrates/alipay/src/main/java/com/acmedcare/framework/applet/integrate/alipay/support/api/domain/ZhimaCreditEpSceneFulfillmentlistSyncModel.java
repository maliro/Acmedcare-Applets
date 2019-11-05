package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 信用服务履约同步(批量)
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:42:21
 */
public class ZhimaCreditEpSceneFulfillmentlistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1387489342416463136L;

	/**
	 * 信用订单号，即调用zhima.credit.ep.scene.agreement.use返回的信用订单号。
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	/**
	 * 履约信息列表，最大不超过200项
	 */
	@ApiListField("fulfillment_info_list")
	@ApiField("fulfillment_info")
	private List<FulfillmentInfo> fulfillmentInfoList;

	public String getCreditOrderNo() {
		return this.creditOrderNo;
	}
	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}

	public List<FulfillmentInfo> getFulfillmentInfoList() {
		return this.fulfillmentInfoList;
	}
	public void setFulfillmentInfoList(List<FulfillmentInfo> fulfillmentInfoList) {
		this.fulfillmentInfoList = fulfillmentInfoList;
	}

}
