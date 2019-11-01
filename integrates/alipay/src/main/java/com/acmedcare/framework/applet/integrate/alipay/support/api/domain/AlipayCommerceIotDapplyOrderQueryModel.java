package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot进件申请单撤销接口
 *
 * @author auto create
 * @since 1.0, 2019-09-16 16:59:04
 */
public class AlipayCommerceIotDapplyOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4287137896546543757L;

	/**
	 * 物料申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	public String getAssetApplyOrderId() {
		return this.assetApplyOrderId;
	}
	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}

}
