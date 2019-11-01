package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.drawdown.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditSceneprodDrawdownApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4434596342876153332L;

	/** 
	 * 序号和支用号的对应关系
	 */
	@ApiField("drawdown_list")
	private String drawdownList;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setDrawdownList(String drawdownList) {
		this.drawdownList = drawdownList;
	}
	public String getDrawdownList( ) {
		return this.drawdownList;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
