package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antdac.easyservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceAntdacEasyserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329647131165997896L;

	/** 
	 * 方法返回值＋json字符串格式
	 */
	@ApiField("ret_val")
	private String retVal;

	public void setRetVal(String retVal) {
		this.retVal = retVal;
	}
	public String getRetVal( ) {
		return this.retVal;
	}

}
