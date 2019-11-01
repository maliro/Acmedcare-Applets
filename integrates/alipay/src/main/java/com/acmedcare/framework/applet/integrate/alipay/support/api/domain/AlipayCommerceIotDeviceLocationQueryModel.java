package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询设备当前位置接口
 *
 * @author auto create
 * @since 1.0, 2019-09-20 12:11:09
 */
public class AlipayCommerceIotDeviceLocationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1563458216473125111L;

	/**
	 * 设备唯一标识，设备id
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
