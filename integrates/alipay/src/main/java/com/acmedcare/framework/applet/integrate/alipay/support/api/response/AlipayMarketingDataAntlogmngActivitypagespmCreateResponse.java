package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.antlogmng.activitypagespm.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:30:54
 */
public class AlipayMarketingDataAntlogmngActivitypagespmCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6385999922253571593L;

	/** 
	 * 申请是否成功
	 */
	@ApiField("issuc")
	private Boolean issuc;

	/** 
	 * 描述业务状态
	 */
	@ApiField("message")
	private String message;

	public void setIssuc(Boolean issuc) {
		this.issuc = issuc;
	}
	public Boolean getIssuc( ) {
		return this.issuc;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
