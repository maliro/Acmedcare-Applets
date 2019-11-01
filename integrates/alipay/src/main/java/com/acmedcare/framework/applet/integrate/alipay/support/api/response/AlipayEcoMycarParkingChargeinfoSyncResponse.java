package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.chargeinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 11:18:10
 */
public class AlipayEcoMycarParkingChargeinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1884424289464942452L;

	/** 
	 * 同步结果：0 成功，1 失败
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
