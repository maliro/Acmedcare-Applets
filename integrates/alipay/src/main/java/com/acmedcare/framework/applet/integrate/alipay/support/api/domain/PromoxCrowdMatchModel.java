package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 智慧人群客群匹配接口返回结果
 *
 * @author auto create
 * @since 1.0, 2018-07-16 17:26:10
 */
public class PromoxCrowdMatchModel extends AlipayObject {

	private static final long serialVersionUID = 6836264784637259367L;

	/**
	 * 客群码
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 是否匹配
	 */
	@ApiField("is_match")
	private Boolean isMatch;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public Boolean getIsMatch() {
		return this.isMatch;
	}
	public void setIsMatch(Boolean isMatch) {
		this.isMatch = isMatch;
	}

}
