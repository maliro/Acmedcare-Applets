package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 企业认证查询
 *
 * @author auto create
 * @since 1.0, 2019-08-01 17:31:20
 */
public class ZhimaCustomerEpIdentificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8236959785269564155L;

	/**
	 * 一次认证的唯一标识,在商户调用认证初始化接口的时候获取。
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
