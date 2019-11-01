package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 外部商品库存信息同步接口
 *
 * @author auto create
 * @since 1.0, 2018-11-28 22:08:44
 */
public class AlipayBusinessItemInventoryExternalSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6368724681375758969L;

	/**
	 * 商品库存信息列表
	 */
	@ApiListField("inventories")
	@ApiField("item_inventory")
	private List<ItemInventory> inventories;

	/**
	 * 请求ID，支持英文字母和数字，由调用者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	public List<ItemInventory> getInventories() {
		return this.inventories;
	}
	public void setInventories(List<ItemInventory> inventories) {
		this.inventories = inventories;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
