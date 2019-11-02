package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashlessitemvoucher.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 08:54:44
 */
public class AlipayMarketingCashlessitemvoucherTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6863695799954645886L;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 使用一张单品券用户可以获得的最大优惠。计算方式和单张券的最大优惠的上限请参考产品说明文档
	 */
	@ApiField("voucher_discount_limit")
	private String voucherDiscountLimit;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setVoucherDiscountLimit(String voucherDiscountLimit) {
		this.voucherDiscountLimit = voucherDiscountLimit;
	}
	public String getVoucherDiscountLimit( ) {
		return this.voucherDiscountLimit;
	}

}