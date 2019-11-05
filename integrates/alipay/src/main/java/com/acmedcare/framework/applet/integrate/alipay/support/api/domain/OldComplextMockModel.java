package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 老版本复杂对象模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class OldComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 3116973525479119167L;

	/**
	 * biz_num
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * biz_type
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 简单model
	 */
	@ApiField("simple_mock_model")
	private SimpleMockModel simpleMockModel;

	public Long getBizNum() {
		return this.bizNum;
	}
	public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public SimpleMockModel getSimpleMockModel() {
		return this.simpleMockModel;
	}
	public void setSimpleMockModel(SimpleMockModel simpleMockModel) {
		this.simpleMockModel = simpleMockModel;
	}

}
