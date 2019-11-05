package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.LotteryType;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lottery.typelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceLotteryTypelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2152239817429714287L;

	/** 
	 * 彩票系统支持的可用于赠送的彩种类型列表
	 */
	@ApiListField("results")
	@ApiField("lottery_type")
	private List<LotteryType> results;

	/** 
	 * 彩票系统支持的可用于赠送的彩种个数
	 */
	@ApiField("total_result")
	private Long totalResult;

	public void setResults(List<LotteryType> results) {
		this.results = results;
	}
	public List<LotteryType> getResults( ) {
		return this.results;
	}

	public void setTotalResult(Long totalResult) {
		this.totalResult = totalResult;
	}
	public Long getTotalResult( ) {
		return this.totalResult;
	}

}
