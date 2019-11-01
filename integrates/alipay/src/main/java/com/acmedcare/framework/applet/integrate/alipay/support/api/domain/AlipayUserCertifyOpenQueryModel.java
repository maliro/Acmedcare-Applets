package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 支付宝开放认证查询
 *
 * @author auto create
 * @since 1.0, 2018-10-26 19:04:04
 */
public class AlipayUserCertifyOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7593824815998192966L;

	/**
	 * 本次申请操作的唯一标识，由开放认证初始化接口调用后生成，后续的操作都需要用到
	 */
	@ApiField("certify_id")
	private String certifyId;

	public String getCertifyId() {
		return this.certifyId;
	}
	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
	}

}
