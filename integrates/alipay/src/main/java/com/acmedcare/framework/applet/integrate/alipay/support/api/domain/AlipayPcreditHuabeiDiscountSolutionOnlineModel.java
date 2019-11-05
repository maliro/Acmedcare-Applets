package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 发布花呗分期商家贴息方案实例
 *
 * @author auto create
 * @since 1.0, 2019-08-30 11:35:16
 */
public class AlipayPcreditHuabeiDiscountSolutionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 7849258141337379593L;

	/**
	 * solution_id，贴息方案实例id
	 */
	@ApiField("solution_id")
	private String solutionId;

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
