package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 车辆驶出上送接口
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:18:01
 */
public class AlipayEcoMycarParkingExitinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2523745765854222737L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 车辆离场时间，格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("out_time")
	private String outTime;

	/**
	 * 支付宝停车场ID，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getOutTime() {
		return this.outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
