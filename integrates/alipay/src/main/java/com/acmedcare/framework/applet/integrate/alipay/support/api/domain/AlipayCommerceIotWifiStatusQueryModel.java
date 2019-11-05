package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * wifi状态查询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 21:52:30
 */
public class AlipayCommerceIotWifiStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8699334286477529963L;

	/**
	 * 设备唯一id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

}
