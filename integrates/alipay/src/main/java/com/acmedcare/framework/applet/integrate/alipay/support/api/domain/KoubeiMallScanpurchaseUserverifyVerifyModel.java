package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 用户订单核销码核销
 *
 * @author auto create
 * @since 1.0, 2019-01-31 16:19:01
 */
public class KoubeiMallScanpurchaseUserverifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8766384133998376737L;

	/**
	 * 口碑店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 核销码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
