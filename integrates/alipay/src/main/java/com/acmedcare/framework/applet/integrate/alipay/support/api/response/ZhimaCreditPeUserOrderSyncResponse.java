package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.user.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 13:55:53
 */
public class ZhimaCreditPeUserOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5295864679144379963L;

	/** 
	 * 外部请求幂等号，即接口入参的out_request_no，接口处理完之后回传
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 业务处理是否成功标记，成功返回true，其他情况下返回false
	 */
	@ApiField("success")
	private Boolean success;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
