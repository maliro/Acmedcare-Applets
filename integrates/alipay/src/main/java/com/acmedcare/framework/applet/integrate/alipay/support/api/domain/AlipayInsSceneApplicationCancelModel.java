package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 投保订单出单撤销
 *
 * @author auto create
 * @since 1.0, 2019-08-26 16:45:44
 */
public class AlipayInsSceneApplicationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8455435917441421592L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

}
