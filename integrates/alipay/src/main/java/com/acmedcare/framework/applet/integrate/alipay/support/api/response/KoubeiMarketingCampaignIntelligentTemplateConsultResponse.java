package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.intelligent.template.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignIntelligentTemplateConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1679337983627351146L;

	/** 
	 * 营销模板的编号
GENERAL_NORMAL：全场普通；
ITEM_NORMAL：单品普通;
CROWD_NORMAL: 千人千券普通；
	 */
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	public void setTemplateCodes(List<String> templateCodes) {
		this.templateCodes = templateCodes;
	}
	public List<String> getTemplateCodes( ) {
		return this.templateCodes;
	}

}
