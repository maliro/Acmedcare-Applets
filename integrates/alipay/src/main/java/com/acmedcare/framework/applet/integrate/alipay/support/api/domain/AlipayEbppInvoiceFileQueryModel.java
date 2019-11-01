package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 依据发票id查询发票文件信息
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:02:51
 */
public class AlipayEbppInvoiceFileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3693563644445879973L;

	/**
	 * 支付宝端生成的发票id，该字段可从发票详情查询接口获得
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

}
