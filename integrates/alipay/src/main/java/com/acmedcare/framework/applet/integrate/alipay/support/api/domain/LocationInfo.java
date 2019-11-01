package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 20:18:37
 */
public class LocationInfo extends AlipayObject {

	private static final long serialVersionUID = 2429412492913246628L;

	/**
	 * 用户所处的经度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前的纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 国家统一行政编码
	 */
	@ApiField("region_code")
	private String regionCode;

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

}
