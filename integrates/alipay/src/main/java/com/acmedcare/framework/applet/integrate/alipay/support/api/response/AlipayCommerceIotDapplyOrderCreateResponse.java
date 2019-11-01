package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:50:09
 */
public class AlipayCommerceIotDapplyOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4258544794572298196L;

	/** 
	 * 物料申请单号，即SO单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}
	public String getAssetApplyOrderId( ) {
		return this.assetApplyOrderId;
	}

}
