package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 公交盒子地理围栏设置接口
 *
 * @author auto create
 * @since 1.0, 2019-09-20 12:12:03
 */
public class AlipayCommerceIotDeviceGeofenceSetModel extends AlipayObject {

	private static final long serialVersionUID = 6223231467748213551L;

	/**
	 * 地图围栏事件. 如果是createOrUpdate,则必填,如果是delete,则可不填
	 */
	@ApiField("fence_event")
	private FenceEvent fenceEvent;

	/**
	 * 操作类型.取值:createOrUpdate/delete. 表示新增或修改/删除该地理围栏事件
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 一组地理围栏的唯一标识, 通常一条公交线路
	 */
	@ApiField("route_code")
	private String routeCode;

	public FenceEvent getFenceEvent() {
		return this.fenceEvent;
	}
	public void setFenceEvent(FenceEvent fenceEvent) {
		this.fenceEvent = fenceEvent;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getRouteCode() {
		return this.routeCode;
	}
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

}