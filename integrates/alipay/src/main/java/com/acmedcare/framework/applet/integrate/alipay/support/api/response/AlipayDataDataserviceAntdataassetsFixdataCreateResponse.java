package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdataassets.fixdata.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-30 14:23:24
 */
public class AlipayDataDataserviceAntdataassetsFixdataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3326554548243242316L;

	/** 
	 * 补数据操作是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
