package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.leads.saleleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 20:15:43
 */
public class KoubeiSalesLeadsSaleleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8271456942441692849L;

	/** 
	 * 生成的销售LeadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}
