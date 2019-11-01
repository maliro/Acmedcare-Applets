package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.fuzzy.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-11 20:46:43
 */
public class AlipayEbppInvoiceTitleFuzzyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5611278345183635899L;

	/** 
	 * 企业名称列表
	 */
	@ApiListField("enterprise_name")
	@ApiField("string")
	private List<String> enterpriseName;

	public void setEnterpriseName(List<String> enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public List<String> getEnterpriseName( ) {
		return this.enterpriseName;
	}

}
