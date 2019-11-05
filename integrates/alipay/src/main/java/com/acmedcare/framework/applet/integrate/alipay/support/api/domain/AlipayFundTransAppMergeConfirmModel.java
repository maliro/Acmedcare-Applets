package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * app合并转账接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 16:04:18
 */
public class AlipayFundTransAppMergeConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4736975558597272462L;

	/**
	 * 业务场景。
DINGTALK_PERSONAL_PAY：钉钉个人付款
DINGTALK_MERCHANT_PAY：钉钉企业付款
DINGTALK_MERCHANT_COLLECTION：钉钉企业收款
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 合并转账的预下单id
	 */
	@ApiField("merge_order_id")
	private String mergeOrderId;

	/**
	 * 销售产品码。
STD_APP_TRANSFER：支付宝APP收银台转账
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMergeOrderId() {
		return this.mergeOrderId;
	}
	public void setMergeOrderId(String mergeOrderId) {
		this.mergeOrderId = mergeOrderId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
