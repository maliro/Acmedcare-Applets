package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 修改支付方式排序
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:30:03
 */
public class KoubeiCateringPosPaymodesortModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7693859386646155449L;

	/**
	 * 支付方式名称列表
	 */
	@ApiListField("pay_names")
	@ApiField("string")
	private List<String> payNames;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<String> getPayNames() {
		return this.payNames;
	}
	public void setPayNames(List<String> payNames) {
		this.payNames = payNames;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
