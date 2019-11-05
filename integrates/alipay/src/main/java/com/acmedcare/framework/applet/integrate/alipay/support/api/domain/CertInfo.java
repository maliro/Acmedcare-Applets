package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 收款方身份认证信息。
 *
 * @author auto create
 * @since 1.0, 2018-05-18 14:34:36
 */
public class CertInfo extends AlipayObject {

	private static final long serialVersionUID = 1582987977353337587L;

	/**
	 * 代发时商家上传的收款方证件号码

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 代发时商家上传的收款方证件类型。

biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("cert_type")
	private String certType;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

}
