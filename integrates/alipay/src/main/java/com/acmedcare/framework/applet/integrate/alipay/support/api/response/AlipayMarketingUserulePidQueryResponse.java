package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.userule.pid.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingUserulePidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6334946223724134497L;

	/** 
	 * 满足条件的所有pid，多个pid使用英文逗号隔开
	 */
	@ApiField("pids")
	private String pids;

	public void setPids(String pids) {
		this.pids = pids;
	}
	public String getPids( ) {
		return this.pids;
	}

}
