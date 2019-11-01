package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 订单参加活动信息
 *
 * @author auto create
 * @since 1.0, 2017-09-27 10:58:52
 */
public class KbOrderActivityModel extends AlipayObject {

	private static final long serialVersionUID = 4784165415693484317L;

	/**
	 * 活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
