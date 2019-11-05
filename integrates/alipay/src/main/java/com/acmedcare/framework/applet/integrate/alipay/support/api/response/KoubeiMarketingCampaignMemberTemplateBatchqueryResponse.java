package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MerchantMemberTemplateModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.member.template.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignMemberTemplateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4724778185721934154L;

	/** 
	 * 会员模板模型
	 */
	@ApiListField("member_templates")
	@ApiField("merchant_member_template_model")
	private List<MerchantMemberTemplateModel> memberTemplates;

	public void setMemberTemplates(List<MerchantMemberTemplateModel> memberTemplates) {
		this.memberTemplates = memberTemplates;
	}
	public List<MerchantMemberTemplateModel> getMemberTemplates( ) {
		return this.memberTemplates;
	}

}
