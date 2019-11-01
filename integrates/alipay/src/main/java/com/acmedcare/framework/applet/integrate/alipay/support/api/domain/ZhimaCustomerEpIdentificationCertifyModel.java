package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 企业认证V2执行
 *
 * @author auto create
 * @since 1.0, 2019-08-01 17:31:11
 */
public class ZhimaCustomerEpIdentificationCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 4451443122662397974L;

	/**
	 * 一次认证的唯一标识，在完成企业认证初始化后可以获取。
	 */
	@ApiField("biz_no")
	private String bizNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

}
