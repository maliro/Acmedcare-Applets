package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑菜品库数据同步
 *
 * @author auto create
 * @since 1.0, 2019-08-13 11:25:05
 */
public class KoubeiCateringDishSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3552847738337825516L;

	/**
	 * dish：操作菜品模型 ;sku:操作关联sku
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 口碑菜品模型
	 */
	@ApiField("kb_dish_info")
	private KbdishInfo kbDishInfo;

	/**
	 * 同步类型: add 新增;update 修改;stateChange 状态变更,del 删除
	 */
	@ApiField("syn_type")
	private String synType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public KbdishInfo getKbDishInfo() {
		return this.kbDishInfo;
	}
	public void setKbDishInfo(KbdishInfo kbDishInfo) {
		this.kbDishInfo = kbDishInfo;
	}

	public String getSynType() {
		return this.synType;
	}
	public void setSynType(String synType) {
		this.synType = synType;
	}

}
