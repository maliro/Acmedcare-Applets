package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 易联云token获取对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:34
 */
public class AlipayEcoEprintTokenGetModel extends AlipayObject {

	private static final long serialVersionUID = 1814746546843381316L;

	/**
	 * 是否优先从缓存中拿取，false则强制刷新，1天20次
	 */
	@ApiField("cache_first")
	private Boolean cacheFirst;

	/**
	 * 应用ID
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 应用Secret
	 */
	@ApiField("client_secret")
	private String clientSecret;

	public Boolean getCacheFirst() {
		return this.cacheFirst;
	}
	public void setCacheFirst(Boolean cacheFirst) {
		this.cacheFirst = cacheFirst;
	}

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

}
