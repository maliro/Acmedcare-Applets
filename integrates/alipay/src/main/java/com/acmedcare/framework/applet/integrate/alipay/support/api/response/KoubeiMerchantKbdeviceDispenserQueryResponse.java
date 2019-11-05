package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.FoodDispenserCellInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.kbdevice.dispenser.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantKbdeviceDispenserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7879346674231984714L;

	/** 
	 * 取餐柜设备是否可用
	 */
	@ApiField("availability")
	private Boolean availability;

	/** 
	 * 取餐柜的单元格详情列表
	 */
	@ApiListField("cell_info_list")
	@ApiField("food_dispenser_cell_info")
	private List<FoodDispenserCellInfo> cellInfoList;

	/** 
	 * 取餐柜的唯一设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	public Boolean getAvailability( ) {
		return this.availability;
	}

	public void setCellInfoList(List<FoodDispenserCellInfo> cellInfoList) {
		this.cellInfoList = cellInfoList;
	}
	public List<FoodDispenserCellInfo> getCellInfoList( ) {
		return this.cellInfoList;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId( ) {
		return this.deviceId;
	}

}
