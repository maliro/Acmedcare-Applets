package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 取餐柜详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:36:17
 */
public class KoubeiMerchantKbdeviceDispenserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2382936435813812661L;

	/**
	 * 取餐柜的唯一设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
