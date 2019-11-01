package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 负责对象mock模型
 *
 * @author auto create
 * @since 1.0, 2016-10-27 16:59:24
 */
public class ComplextMockModel extends AlipayObject {

	private static final long serialVersionUID = 8854419384188246351L;

	/**
	 * biz_model
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	/**
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/**
	 * 208xxx
	 */
	@ApiField("biz_type")
	private String bizType;

	public SimpleMockModel getBizModel() {
		return this.bizModel;
	}
	public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}

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

}
