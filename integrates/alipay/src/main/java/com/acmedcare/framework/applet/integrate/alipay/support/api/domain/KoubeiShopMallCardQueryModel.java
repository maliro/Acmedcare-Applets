package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商圈会员卡信息查询
 *
 * @author auto create
 * @since 1.0, 2018-06-22 11:26:57
 */
public class KoubeiShopMallCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7366617191383751436L;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
