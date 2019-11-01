package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 删除资金券模板
 *
 * @author auto create
 * @since 1.0, 2018-01-30 22:43:25
 */
public class AlipayMarketingVoucherTemplateDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4816319585943855842L;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
