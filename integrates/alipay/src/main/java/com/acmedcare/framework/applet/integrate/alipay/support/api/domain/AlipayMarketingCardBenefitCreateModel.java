package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益创建
 *
 * @author auto create
 * @since 1.0, 2019-08-08 19:59:10
 */
public class AlipayMarketingCardBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4578558287544798468L;

	/**
	 * 会员卡模板外部权益
	 */
	@ApiField("mcard_template_benefit")
	private McardTemplateBenefit mcardTemplateBenefit;

	public McardTemplateBenefit getMcardTemplateBenefit() {
		return this.mcardTemplateBenefit;
	}
	public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}

}
