package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MerchantScreenHit;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.amlrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdAmlriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1198468673727547443L;

	/** 
	 * 事件ID，由入参得来
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 根据反洗钱风险检查，该商户是否有风险，有风险则为Yes，无风险则为No
	 */
	@ApiField("has_risk")
	private String hasRisk;

	/** 
	 * 商户ID，由入参得来
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 当发现有风险时，以列表形式表示风险详情，风险点可以有0个至多个。
	 */
	@ApiListField("risks")
	@ApiField("merchant_screen_hit")
	private List<MerchantScreenHit> risks;

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

	public void setHasRisk(String hasRisk) {
		this.hasRisk = hasRisk;
	}
	public String getHasRisk( ) {
		return this.hasRisk;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId( ) {
		return this.merchantId;
	}

	public void setRisks(List<MerchantScreenHit> risks) {
		this.risks = risks;
	}
	public List<MerchantScreenHit> getRisks( ) {
		return this.risks;
	}

}