package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsCertificate;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsProduct;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.coupon.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:35
 */
public class AlipayInsSceneCouponSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2322894384276685838L;

	/** 
	 * 发奖凭证
	 */
	@ApiField("certificate")
	private InsCertificate certificate;

	/** 
	 * 活动ID
	 */
	@ApiField("compaign_id")
	private String compaignId;

	/** 
	 * 发奖流水ID
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 保险产品
	 */
	@ApiField("product")
	private InsProduct product;

	public void setCertificate(InsCertificate certificate) {
		this.certificate = certificate;
	}
	public InsCertificate getCertificate( ) {
		return this.certificate;
	}

	public void setCompaignId(String compaignId) {
		this.compaignId = compaignId;
	}
	public String getCompaignId( ) {
		return this.compaignId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

	public void setProduct(InsProduct product) {
		this.product = product;
	}
	public InsProduct getProduct( ) {
		return this.product;
	}

}