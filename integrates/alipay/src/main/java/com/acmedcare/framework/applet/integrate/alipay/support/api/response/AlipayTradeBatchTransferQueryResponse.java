package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BatchRoyaltyDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.transfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-12 17:16:54
 */
public class AlipayTradeBatchTransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4845663933425271366L;

	/** 
	 * 批量结算时传入的外部流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 批量结算详情
	 */
	@ApiListField("royalty_detail")
	@ApiField("batch_royalty_detail")
	private List<BatchRoyaltyDetail> royaltyDetail;

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

	public void setRoyaltyDetail(List<BatchRoyaltyDetail> royaltyDetail) {
		this.royaltyDetail = royaltyDetail;
	}
	public List<BatchRoyaltyDetail> getRoyaltyDetail( ) {
		return this.royaltyDetail;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
