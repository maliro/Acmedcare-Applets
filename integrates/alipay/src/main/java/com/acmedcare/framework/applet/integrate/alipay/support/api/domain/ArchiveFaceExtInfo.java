package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 档案人脸扩展信息
 *
 * @author auto create
 * @since 1.0, 2019-07-09 16:45:02
 */
public class ArchiveFaceExtInfo extends AlipayObject {

	private static final long serialVersionUID = 2778667642479777743L;

	/**
	 * 证件提供者的支付宝uid
	 */
	@ApiField("provider_uid")
	private String providerUid;

	public String getProviderUid() {
		return this.providerUid;
	}
	public void setProviderUid(String providerUid) {
		this.providerUid = providerUid;
	}

}
