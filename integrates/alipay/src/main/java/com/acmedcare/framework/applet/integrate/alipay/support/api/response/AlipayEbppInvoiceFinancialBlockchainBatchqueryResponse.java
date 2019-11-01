package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InvoiceElementModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.financial.blockchain.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 16:50:09
 */
public class AlipayEbppInvoiceFinancialBlockchainBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7836236948828951575L;

	/** 
	 * 发票列表
	 */
	@ApiListField("invoice_element_list")
	@ApiField("invoice_element_model")
	private List<InvoiceElementModel> invoiceElementList;

	public void setInvoiceElementList(List<InvoiceElementModel> invoiceElementList) {
		this.invoiceElementList = invoiceElementList;
	}
	public List<InvoiceElementModel> getInvoiceElementList( ) {
		return this.invoiceElementList;
	}

}
