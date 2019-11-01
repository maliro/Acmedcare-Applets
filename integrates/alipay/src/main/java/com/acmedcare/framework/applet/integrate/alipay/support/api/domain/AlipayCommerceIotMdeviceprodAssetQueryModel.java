package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询物料模板信息
 *
 * @author auto create
 * @since 1.0, 2019-09-16 16:56:52
 */
public class AlipayCommerceIotMdeviceprodAssetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4745693828632889457L;

	/**
	 * 模板ID（物料系统的item_id）
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
