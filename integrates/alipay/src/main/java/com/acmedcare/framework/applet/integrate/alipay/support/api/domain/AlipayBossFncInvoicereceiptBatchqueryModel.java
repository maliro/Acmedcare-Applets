package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 根据月账单号集合和来源查询开票单据及金额汇总
 *
 * @author auto create
 * @since 1.0, 2019-09-12 15:42:15
 */
public class AlipayBossFncInvoicereceiptBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7377142251895799846L;

	/**
	 * 月账单号集合，唯一性ID集合，月账单表唯一主键ID集合
	 */
	@ApiListField("bill_nos")
	@ApiField("string")
	private List<String> billNos;

	/**
	 * 来源类型，01：主站；02：芝麻；03：金融云；04：微贷
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	public List<String> getBillNos() {
		return this.billNos;
	}
	public void setBillNos(List<String> billNos) {
		this.billNos = billNos;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

}
