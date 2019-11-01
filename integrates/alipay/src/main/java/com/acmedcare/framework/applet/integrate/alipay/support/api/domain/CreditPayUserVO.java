package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 贷记资产用户模型
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:25:19
 */
public class CreditPayUserVO extends AlipayObject {

	private static final long serialVersionUID = 7367643538654286258L;

	/**
	 * 支付宝UID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 1.ALIPAY(支付宝)
2.TAOBAO(淘宝)
3.CBU(中文站)
4.ICBU(国际站)
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点用户id
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
