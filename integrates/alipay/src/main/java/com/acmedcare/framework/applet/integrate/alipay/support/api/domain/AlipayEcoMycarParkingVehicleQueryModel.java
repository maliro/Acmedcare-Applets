package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 车牌查询接口
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:17:54
 */
public class AlipayEcoMycarParkingVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6553737586724614435L;

	/**
	 * 支付宝用户车辆ID，系统唯一。（该参数会在停车平台用户点击查询缴费，跳转到ISV停车缴费查询页面时，从请求中传递）
	 */
	@ApiField("car_id")
	private String carId;

	public String getCarId() {
		return this.carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}

}
