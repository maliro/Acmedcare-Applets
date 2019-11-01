package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.metainfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-09 15:45:45
 */
public class SsdataDataserviceMetainfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6714687569466594534L;

	/** 
	 * 是否同步成功
	 */
	@ApiField("is_sync_success")
	private Boolean isSyncSuccess;

	/** 
	 * 返回同步成功或者失败的信息
	 */
	@ApiField("sync_result")
	private String syncResult;

	public void setIsSyncSuccess(Boolean isSyncSuccess) {
		this.isSyncSuccess = isSyncSuccess;
	}
	public Boolean getIsSyncSuccess( ) {
		return this.isSyncSuccess;
	}

	public void setSyncResult(String syncResult) {
		this.syncResult = syncResult;
	}
	public String getSyncResult( ) {
		return this.syncResult;
	}

}
