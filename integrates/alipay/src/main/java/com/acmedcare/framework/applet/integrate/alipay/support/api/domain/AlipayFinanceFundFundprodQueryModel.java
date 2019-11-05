package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询基金产品基础数据
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:25
 */
public class AlipayFinanceFundFundprodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2866694283532719181L;

	/**
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}
