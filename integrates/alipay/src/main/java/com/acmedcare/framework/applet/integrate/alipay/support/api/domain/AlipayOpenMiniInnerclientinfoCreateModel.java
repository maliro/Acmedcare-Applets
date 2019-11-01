package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 新增小程序端信息
 *
 * @author auto create
 * @since 1.0, 2019-08-23 15:36:53
 */
public class AlipayOpenMiniInnerclientinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3597348921312669166L;

	/**
	 * 端ID，不可重复，接入方需要和小程序平台约定格式
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 端名称
	 */
	@ApiField("bundle_name")
	private String bundleName;

	/**
	 * 端信息缓存前缀，不可重复，接入方需要和小程序平台约定前后缀信息
	 */
	@ApiField("bundle_prefix")
	private String bundlePrefix;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getBundleName() {
		return this.bundleName;
	}
	public void setBundleName(String bundleName) {
		this.bundleName = bundleName;
	}

	public String getBundlePrefix() {
		return this.bundlePrefix;
	}
	public void setBundlePrefix(String bundlePrefix) {
		this.bundlePrefix = bundlePrefix;
	}

}
