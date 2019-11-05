package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.location.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-20 12:11:16
 */
public class AlipayCommerceIotDeviceLocationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7818267618726229646L;

	/** 
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 设备位置的获取时间,13位时间戳,精确到毫秒
	 */
	@ApiField("time")
	private Long time;

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setTime(Long time) {
		this.time = time;
	}
	public Long getTime( ) {
		return this.time;
	}

}
