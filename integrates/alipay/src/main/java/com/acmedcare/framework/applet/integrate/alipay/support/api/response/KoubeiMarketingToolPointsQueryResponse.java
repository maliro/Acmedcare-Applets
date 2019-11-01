package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.tool.points.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingToolPointsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8122982816558511589L;

	/** 
	 * 可用集点
	 */
	@ApiField("available_points")
	private String availablePoints;

	/** 
	 * 冻结集点
	 */
	@ApiField("freezed_points")
	private String freezedPoints;

	/** 
	 * 累计集点
	 */
	@ApiField("total_points")
	private String totalPoints;

	public void setAvailablePoints(String availablePoints) {
		this.availablePoints = availablePoints;
	}
	public String getAvailablePoints( ) {
		return this.availablePoints;
	}

	public void setFreezedPoints(String freezedPoints) {
		this.freezedPoints = freezedPoints;
	}
	public String getFreezedPoints( ) {
		return this.freezedPoints;
	}

	public void setTotalPoints(String totalPoints) {
		this.totalPoints = totalPoints;
	}
	public String getTotalPoints( ) {
		return this.totalPoints;
	}

}
