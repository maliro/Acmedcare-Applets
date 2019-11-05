package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5594838572671228335L;

	/** 
	 * 用户标签id列表，以英文逗号分隔
	 */
	@ApiField("label_ids")
	private String labelIds;

	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	public String getLabelIds( ) {
		return this.labelIds;
	}

}
