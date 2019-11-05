package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BatchSettleDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.settle.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-12 18:35:33
 */
public class AlipayTradeBatchSettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2472531724681729435L;

	/** 
	 * 批量结算时传入的外部流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 批量结算详情
	 */
	@ApiListField("settle_detail")
	@ApiField("batch_settle_detail")
	private List<BatchSettleDetail> settleDetail;

	/** 
	 * 结算单据号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setSettleDetail(List<BatchSettleDetail> settleDetail) {
		this.settleDetail = settleDetail;
	}
	public List<BatchSettleDetail> getSettleDetail( ) {
		return this.settleDetail;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
