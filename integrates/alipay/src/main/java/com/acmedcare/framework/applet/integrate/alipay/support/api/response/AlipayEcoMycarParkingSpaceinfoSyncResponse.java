package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.spaceinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 11:18:16
 */
public class AlipayEcoMycarParkingSpaceinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3145854862146167299L;

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
