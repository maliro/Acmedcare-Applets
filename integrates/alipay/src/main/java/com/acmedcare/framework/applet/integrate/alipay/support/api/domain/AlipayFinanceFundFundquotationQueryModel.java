package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询基金产品收益率
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:44
 */
public class AlipayFinanceFundFundquotationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1312187124288495532L;

	/**
	 * 基金编号：基金产品编号
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
