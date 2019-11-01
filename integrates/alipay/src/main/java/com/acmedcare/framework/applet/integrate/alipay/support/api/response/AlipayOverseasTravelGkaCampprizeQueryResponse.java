package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PrizeInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.gka.campprize.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasTravelGkaCampprizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6852961715592995737L;

	/** 
	 * 奖品信息列表，一定不为null，但是size可以为0
	 */
	@ApiListField("prizes")
	@ApiField("prize_info")
	private List<PrizeInfo> prizes;

	public void setPrizes(List<PrizeInfo> prizes) {
		this.prizes = prizes;
	}
	public List<PrizeInfo> getPrizes( ) {
		return this.prizes;
	}

}
