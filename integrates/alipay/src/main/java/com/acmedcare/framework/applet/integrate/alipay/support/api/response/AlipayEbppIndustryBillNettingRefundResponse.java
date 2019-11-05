package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.IndustryExtendField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.bill.netting.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppIndustryBillNettingRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1837884866651635648L;

	/** 
	 * 回传支付宝流水号。
	 */
	@ApiField("alipay_bill_no")
	private String alipayBillNo;

	/** 
	 * 扩展字段，一系列键值对属性列表，示例只是个形式，具体的Key-Value需要根据具体业务另行约定。
无特别约定时，此字段不必传。
	 */
	@ApiListField("industry_extend_field_list")
	@ApiField("industry_extend_field")
	private List<IndustryExtendField> industryExtendFieldList;

	public void setAlipayBillNo(String alipayBillNo) {
		this.alipayBillNo = alipayBillNo;
	}
	public String getAlipayBillNo( ) {
		return this.alipayBillNo;
	}

	public void setIndustryExtendFieldList(List<IndustryExtendField> industryExtendFieldList) {
		this.industryExtendFieldList = industryExtendFieldList;
	}
	public List<IndustryExtendField> getIndustryExtendFieldList( ) {
		return this.industryExtendFieldList;
	}

}
