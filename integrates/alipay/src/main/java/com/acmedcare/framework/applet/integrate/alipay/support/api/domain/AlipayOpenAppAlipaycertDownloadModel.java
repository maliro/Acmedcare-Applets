package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 应用支付宝公钥证书下载
 *
 * @author auto create
 * @since 1.0, 2019-08-14 15:33:13
 */
public class AlipayOpenAppAlipaycertDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 1278867244981972922L;

	/**
	 * 支付宝公钥证书序列号
	 */
	@ApiField("alipay_cert_sn")
	private String alipayCertSn;

	public String getAlipayCertSn() {
		return this.alipayCertSn;
	}
	public void setAlipayCertSn(String alipayCertSn) {
		this.alipayCertSn = alipayCertSn;
	}

}