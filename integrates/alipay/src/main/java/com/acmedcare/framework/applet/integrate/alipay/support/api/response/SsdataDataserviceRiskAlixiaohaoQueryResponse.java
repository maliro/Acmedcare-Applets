package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.alixiaohao.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataDataserviceRiskAlixiaohaoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7777171351189853858L;

	/** 
	 * 是否阿里小号
	 */
	@ApiField("is_alixiaohao")
	private Boolean isAlixiaohao;

	public void setIsAlixiaohao(Boolean isAlixiaohao) {
		this.isAlixiaohao = isAlixiaohao;
	}
	public Boolean getIsAlixiaohao( ) {
		return this.isAlixiaohao;
	}

}
