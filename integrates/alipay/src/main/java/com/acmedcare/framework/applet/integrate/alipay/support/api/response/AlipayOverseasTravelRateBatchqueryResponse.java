package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.rate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasTravelRateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5816549142668115187L;

	/** 
	 * 汇率描述
	 */
	@ApiField("rate_desc")
	private String rateDesc;

	/** 
	 * 汇率来源说明
	 */
	@ApiField("rate_source")
	private String rateSource;

	/** 
	 * 多个币种汇率结果，currency:货币代码，ISO标准alpha- 3币种代码;
rate:当前币种/CNY的汇率,Number(15,8)
currency_icon:货币图片的url地址
	 */
	@ApiField("rates")
	private String rates;

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}
	public String getRateDesc( ) {
		return this.rateDesc;
	}

	public void setRateSource(String rateSource) {
		this.rateSource = rateSource;
	}
	public String getRateSource( ) {
		return this.rateSource;
	}

	public void setRates(String rates) {
		this.rates = rates;
	}
	public String getRates( ) {
		return this.rates;
	}

}
