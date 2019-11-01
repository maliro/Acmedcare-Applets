package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 运动项目同步
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:28:56
 */
public class KoubeiServindustryExerciseItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2249687394132677661L;

	/**
	 * linux时间戳
	 */
	@ApiField("data_version")
	private Long dataVersion;

	/**
	 * 健身项目列表
	 */
	@ApiListField("item_list")
	@ApiField("exercise_item")
	private List<ExerciseItem> itemList;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	public Long getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(Long dataVersion) {
		this.dataVersion = dataVersion;
	}

	public List<ExerciseItem> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ExerciseItem> itemList) {
		this.itemList = itemList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
