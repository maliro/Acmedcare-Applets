package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 核实流程签名
 *
 * @author auto create
 * @since 1.0, 2019-09-06 15:00:57
 */
public class AlipayBossBaseProcessSignVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 3272163464933693421L;

	/**
	 * 流程唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * mnotify签名直接回传
	 */
	@ApiField("sign_content")
	private String signContent;

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

	public String getSignContent() {
		return this.signContent;
	}
	public void setSignContent(String signContent) {
		this.signContent = signContent;
	}

}
