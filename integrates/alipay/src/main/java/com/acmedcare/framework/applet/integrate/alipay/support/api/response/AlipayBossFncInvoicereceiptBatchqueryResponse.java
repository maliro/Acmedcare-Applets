package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ArInvoiceReceiptOpenApiResponse;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MultiCurrencyMoneyOpenApi;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoicereceipt.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-12 15:42:15
 */
public class AlipayBossFncInvoicereceiptBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3139744936668449793L;

	/** 
	 * 返回结果对象：可开票单据
	 */
	@ApiListField("result_set")
	@ApiField("ar_invoice_receipt_open_api_response")
	private List<ArInvoiceReceiptOpenApiResponse> resultSet;

	/** 
	 * 可开票总金额，可开票单据返回集合中可开票金额汇总
	 */
	@ApiField("total_inv_amt")
	private MultiCurrencyMoneyOpenApi totalInvAmt;

	/** 
	 * 已开票总金额，可开票单据返回集合中已开票金额汇总
	 */
	@ApiField("total_inved_amt")
	private MultiCurrencyMoneyOpenApi totalInvedAmt;

	/** 
	 * 关联票总金额，可开票单据返回集合中关联金额汇总
	 */
	@ApiField("total_link_invoice_amt")
	private MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt;

	public void setResultSet(List<ArInvoiceReceiptOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ArInvoiceReceiptOpenApiResponse> getResultSet( ) {
		return this.resultSet;
	}

	public void setTotalInvAmt(MultiCurrencyMoneyOpenApi totalInvAmt) {
		this.totalInvAmt = totalInvAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalInvAmt( ) {
		return this.totalInvAmt;
	}

	public void setTotalInvedAmt(MultiCurrencyMoneyOpenApi totalInvedAmt) {
		this.totalInvedAmt = totalInvedAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalInvedAmt( ) {
		return this.totalInvedAmt;
	}

	public void setTotalLinkInvoiceAmt(MultiCurrencyMoneyOpenApi totalLinkInvoiceAmt) {
		this.totalLinkInvoiceAmt = totalLinkInvoiceAmt;
	}
	public MultiCurrencyMoneyOpenApi getTotalLinkInvoiceAmt( ) {
		return this.totalLinkInvoiceAmt;
	}

}
