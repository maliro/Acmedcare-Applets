package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundTransAacollectBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5461712196212655484L;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次随机batchToken
	 */
	@ApiField("batch_token")
	private String batchToken;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchToken(String batchToken) {
		this.batchToken = batchToken;
	}
	public String getBatchToken( ) {
		return this.batchToken;
	}

}
