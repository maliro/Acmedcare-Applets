package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-11 23:35:01
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8494429375352955439L;

	/** 
	 * 支付宝返回停车场id。成功不为空，失败返回空
	 */
	@ApiField("parking_id")
	private String parkingId;

	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	public String getParkingId( ) {
		return this.parkingId;
	}

}
