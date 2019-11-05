package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 升级模板实例化小程序
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:46:51
 */
public class AlipayOpenMiniInnerversionUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 6728435795426792731L;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入。
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端ID，多端场景下区分不同端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 需要升级的实例小程序appId，仅用于一方链路，其他无用
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 用于升级的模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 用于升级的模板版本号，版本号必须满足 x.y.z, 且均为数字
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
