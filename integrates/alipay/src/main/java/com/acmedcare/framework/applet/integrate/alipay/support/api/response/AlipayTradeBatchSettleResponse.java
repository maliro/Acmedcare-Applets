package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.settle response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-12 18:35:50
 */
public class AlipayTradeBatchSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 2569282161684527141L;

	/** 
	 * 结算受理时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 结算请求外部流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 业务结果码。

ACCEPT_SUCCESS：受理成功；
ACCEPT_FAIL：受理失败；
SUCCESS：结算处理成功；
FAIL：结算处理失败；
SYSTEM_EXCEPTION：系统异常
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结算单据号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
