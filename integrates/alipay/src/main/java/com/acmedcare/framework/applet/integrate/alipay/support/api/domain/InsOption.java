package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 保额选项
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:11:17
 */
public class InsOption extends AlipayObject {

	private static final long serialVersionUID = 5336565283156518398L;

	/**
	 * 保额key
	 */
	@ApiField("coverage")
	private String coverage;

	/**
	 * 保额value
	 */
	@ApiField("coverage_text")
	private String coverageText;

	public String getCoverage() {
		return this.coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getCoverageText() {
		return this.coverageText;
	}
	public void setCoverageText(String coverageText) {
		this.coverageText = coverageText;
	}

}
