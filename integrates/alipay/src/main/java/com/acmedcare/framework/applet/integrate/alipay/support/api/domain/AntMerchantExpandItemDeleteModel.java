package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品删除接口
 *
 * @author auto create
 * @since 1.0, 2019-09-16 19:45:51
 */
public class AntMerchantExpandItemDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2212659198116421278L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

}
