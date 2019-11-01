package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.community.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 19:46:07
 */
public class AlipayEcoRenthouseCommunityInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7144772277788992334L;

	/** 
	 * 小区同步请求号
	 */
	@ApiField("comm_req_id")
	private String commReqId;

	/** 
	 * 小区同步状态
	 */
	@ApiField("status")
	private Long status;

	public void setCommReqId(String commReqId) {
		this.commReqId = commReqId;
	}
	public String getCommReqId( ) {
		return this.commReqId;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
