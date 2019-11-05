package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品状态修改接口
 *
 * @author auto create
 * @since 1.0, 2019-08-16 12:28:30
 */
public class AntMerchantExpandItemStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6166425526144242251L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品状态：EFFECT、INVALID
	 */
	@ApiField("status")
	private String status;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
