package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayHighValueCustomerResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.userlevel.zrank.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 16:30:02
 */
public class AlipayDataDataserviceUserlevelZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7766162368291911349L;

	/** 
	 * 活跃高价值用户返回
	 */
	@ApiField("result")
	private AlipayHighValueCustomerResult result;

	public void setResult(AlipayHighValueCustomerResult result) {
		this.result = result;
	}
	public AlipayHighValueCustomerResult getResult( ) {
		return this.result;
	}

}
