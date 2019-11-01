package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 推荐结果
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:40:40
 */
public class RecResultInfo extends AlipayObject {

	private static final long serialVersionUID = 2785445768171835525L;

	/**
	 * 错误码
NO_REC_ITEMS 无推荐服务
NO_ENOUGH_ITEMS 推荐数量不合法
	 */
	@ApiField("code")
	private String code;

	/**
	 * 推荐ITEM
	 */
	@ApiListField("items")
	@ApiField("rec_item_info")
	private List<RecItemInfo> items;

	/**
	 * 错误消息，如果成功则为空
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 推荐结果
	 */
	@ApiField("position_id")
	private String positionId;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public List<RecItemInfo> getItems() {
		return this.items;
	}
	public void setItems(List<RecItemInfo> items) {
		this.items = items;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPositionId() {
		return this.positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
