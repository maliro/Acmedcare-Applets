package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 点位设备绑定
 *
 * @author auto create
 * @since 1.0, 2019-03-04 21:56:42
 */
public class AlipayDataIotdataPointDeviceBindModel extends AlipayObject {

	private static final long serialVersionUID = 1431993184566539118L;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private Long businessId;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 点位id
	 */
	@ApiField("point_id")
	private Long pointId;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public Long getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getPointId() {
		return this.pointId;
	}
	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
