package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 蚁盾风险评分服务新版
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:07:08
 */
public class SsdataDataserviceRiskRainscoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6859157712697685979L;

	/**
	 * 帐号内容，目前为中国大陆手机号（11位阿拉伯数字，不包含特殊符号或空格）
	 */
	@ApiField("account")
	private String account;

	/**
	 * 账号类型，目前仅支持手机号（MOBILE_NO）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 调用服务的商户id ，如果是第三方服务商，需要将其实际的商户id透传过来，如果是普通商户传入自己的appid即可
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * “蚁盾”风险评分服务版本号，当前版本为2.0
	 */
	@ApiField("version")
	private String version;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
