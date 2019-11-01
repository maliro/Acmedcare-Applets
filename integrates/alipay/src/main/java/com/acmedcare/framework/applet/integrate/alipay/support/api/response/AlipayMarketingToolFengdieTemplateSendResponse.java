package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FengdieSuccessRespModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.template.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:32:09
 */
public class AlipayMarketingToolFengdieTemplateSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1794156842291296288L;

	/** 
	 * 分配模板的操作是否成功
	 */
	@ApiField("data")
	private FengdieSuccessRespModel data;

	public void setData(FengdieSuccessRespModel data) {
		this.data = data;
	}
	public FengdieSuccessRespModel getData( ) {
		return this.data;
	}

}
