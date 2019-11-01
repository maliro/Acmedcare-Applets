package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BillInferenceResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.bill.inference.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-26 12:38:59
 */
public class AlipayIserviceCognitiveBillInferenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1689247384268379268L;

	/** 
	 * 发票识别内容详细信息
	 */
	@ApiField("result")
	private BillInferenceResult result;

	/** 
	 * 信息抽取是否抽取成功
	 */
	@ApiField("ret")
	private Long ret;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setResult(BillInferenceResult result) {
		this.result = result;
	}
	public BillInferenceResult getResult( ) {
		return this.result;
	}

	public void setRet(Long ret) {
		this.ret = ret;
	}
	public Long getRet( ) {
		return this.ret;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
