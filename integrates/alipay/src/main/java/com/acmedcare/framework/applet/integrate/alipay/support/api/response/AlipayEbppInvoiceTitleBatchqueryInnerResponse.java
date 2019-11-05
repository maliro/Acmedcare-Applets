package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InvoiceTitleModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.batchquery.inner response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-21 17:02:41
 */
public class AlipayEbppInvoiceTitleBatchqueryInnerResponse extends AlipayResponse {

	private static final long serialVersionUID = 4667816136267483346L;

	/** 
	 * 用户抬头列表（包括个人、单位抬头）
	 */
	@ApiListField("title_list")
	@ApiField("invoice_title_model")
	private List<InvoiceTitleModel> titleList;

	public void setTitleList(List<InvoiceTitleModel> titleList) {
		this.titleList = titleList;
	}
	public List<InvoiceTitleModel> getTitleList( ) {
		return this.titleList;
	}

}
