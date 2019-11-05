package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 删除支付方式
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:30:18
 */
public class KoubeiCateringPosPaymodeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1385692943351321414L;

	/**
	 * 支付方式名称
	 */
	@ApiField("pay_name")
	private String payName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 是否系统（false:否；true:是）
	 */
	@ApiField("system")
	private Boolean system;

	public String getPayName() {
		return this.payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Boolean getSystem() {
		return this.system;
	}
	public void setSystem(Boolean system) {
		this.system = system;
	}

}
