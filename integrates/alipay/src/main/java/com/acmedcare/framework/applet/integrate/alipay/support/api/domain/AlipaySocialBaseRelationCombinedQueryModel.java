package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询支付宝好友、可能认识的人，并根据具体的业务数据过滤。
 *
 * @author auto create
 * @since 1.0, 2017-09-12 18:20:28
 */
public class AlipaySocialBaseRelationCombinedQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3894129862678878382L;

	/**
	 * 最大需要返回的列表值
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 关系查询的业务类型编号，此类型由mobilerelation分配，不同的类型对应不同的结果集
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
