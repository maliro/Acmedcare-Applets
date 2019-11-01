package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 预发上测试
 *
 * @author auto create
 * @since 1.0, 2017-12-21 18:50:44
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5726775671871688388L;

	/**
	 * 1111112141414
	 */
	@ApiField("s")
	private String s;

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
