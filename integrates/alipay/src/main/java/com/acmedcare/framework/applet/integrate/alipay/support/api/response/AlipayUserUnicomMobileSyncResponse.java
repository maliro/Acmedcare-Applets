package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.mobile.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserUnicomMobileSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6841942319785174737L;

	/** 
	 * 业务处理结果（成功: SUCCESS, 失败: FAIL, 重试: RETRY）
	 */
	@ApiField("mobile_sync_result")
	private String mobileSyncResult;

	/** 
	 * 回传的业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setMobileSyncResult(String mobileSyncResult) {
		this.mobileSyncResult = mobileSyncResult;
	}
	public String getMobileSyncResult( ) {
		return this.mobileSyncResult;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
