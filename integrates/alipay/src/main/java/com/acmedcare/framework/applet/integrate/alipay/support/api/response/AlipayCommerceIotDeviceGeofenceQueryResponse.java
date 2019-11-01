package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FenceEvent;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.geofence.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-20 12:10:49
 */
public class AlipayCommerceIotDeviceGeofenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8636482561486369839L;

	/** 
	 * 返回线路上绑定的设备列表
	 */
	@ApiListField("bind_device")
	@ApiField("string")
	private List<String> bindDevice;

	/** 
	 * 地图围栏事件
	 */
	@ApiListField("fence_events")
	@ApiField("fence_event")
	private List<FenceEvent> fenceEvents;

	public void setBindDevice(List<String> bindDevice) {
		this.bindDevice = bindDevice;
	}
	public List<String> getBindDevice( ) {
		return this.bindDevice;
	}

	public void setFenceEvents(List<FenceEvent> fenceEvents) {
		this.fenceEvents = fenceEvents;
	}
	public List<FenceEvent> getFenceEvents( ) {
		return this.fenceEvents;
	}

}
