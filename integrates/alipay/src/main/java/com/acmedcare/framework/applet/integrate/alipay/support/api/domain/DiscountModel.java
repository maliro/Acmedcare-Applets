package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 分期折扣信息
 *
 * @author auto create
 * @since 1.0, 2017-09-21 18:35:40
 */
public class DiscountModel extends AlipayObject {

	private static final long serialVersionUID = 6157571795143243768L;

	/**
	 * 每期折扣，保留小数点2位
	 */
	@ApiField("term_discount")
	private String termDiscount;

	/**
	 * 分期期次，0表示不分期，整笔折扣
	 */
	@ApiField("term_no")
	private Long termNo;

	public String getTermDiscount() {
		return this.termDiscount;
	}
	public void setTermDiscount(String termDiscount) {
		this.termDiscount = termDiscount;
	}

	public Long getTermNo() {
		return this.termNo;
	}
	public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

}
