package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 逆向物流信息
 *
 * @author auto create
 * @since 1.0, 2018-09-19 10:49:39
 */
public class AssetReverseGoodsItem extends AlipayObject {

	private static final long serialVersionUID = 6452518579522898512L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 逆向申请单ID
	 */
	@ApiField("reverse_apply_order_id")
	private String reverseApplyOrderId;

	/**
	 * 逆向申请单明细ID
	 */
	@ApiField("reverse_apply_order_item_id")
	private String reverseApplyOrderItemId;

	/**
	 * 标识类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 申请输入信息
	 */
	@ApiField("value")
	private String value;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getReverseApplyOrderId() {
		return this.reverseApplyOrderId;
	}
	public void setReverseApplyOrderId(String reverseApplyOrderId) {
		this.reverseApplyOrderId = reverseApplyOrderId;
	}

	public String getReverseApplyOrderItemId() {
		return this.reverseApplyOrderItemId;
	}
	public void setReverseApplyOrderItemId(String reverseApplyOrderItemId) {
		this.reverseApplyOrderItemId = reverseApplyOrderItemId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
