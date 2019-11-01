package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 贷款期限
 *
 * @author auto create
 * @since 1.0, 2018-11-12 15:38:24
 */
public class LoanTerm extends AlipayObject {

	private static final long serialVersionUID = 8254385826248579652L;

	/**
	 * 贷款期数
	 */
	@ApiField("term")
	private Long term;

	/**
	 * 贷款期限单位，取值{D, M, Y}：D-日; M-月; Y-年
	 */
	@ApiField("term_unit")
	private String termUnit;

	public Long getTerm() {
		return this.term;
	}
	public void setTerm(Long term) {
		this.term = term;
	}

	public String getTermUnit() {
		return this.termUnit;
	}
	public void setTermUnit(String termUnit) {
		this.termUnit = termUnit;
	}

}
