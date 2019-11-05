package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 位置经纬度信息
 *
 * @author auto create
 * @since 1.0, 2019-08-22 10:27:55
 */
public class CloudbusLocation extends AlipayObject {

	private static final long serialVersionUID = 3517753962846457291L;

	/**
	 * 维度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lng")
	private String lng;

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}

}
