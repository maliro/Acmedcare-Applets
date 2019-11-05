package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.member.auth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-06 16:05:01
 */
public class KoubeiMarketingCampaignMemberAuthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3242957583659953232L;

	/** 
	 * 表单提交信息各个字段的值JSON

通用表单字段名称如下示例： 
OPEN_FORM_FIELD_MOBILE – 手机号 
OPEN_FORM_FIELD_GENDER – 性别 
OPEN_FORM_FIELD_NAME – 姓名 
OPEN_FORM_FIELD_BIRTHDAY_WITH_YEAR – 生日
	 */
	@ApiField("infos")
	private String infos;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setInfos(String infos) {
		this.infos = infos;
	}
	public String getInfos( ) {
		return this.infos;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
