package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 转账兑换汇率的基本信息
 *
 * @author auto create
 * @since 1.0, 2018-05-18 14:42:42
 */
public class ExchangeRate extends AlipayObject {

	private static final long serialVersionUID = 8277483294687735113L;

	/**
	 * 兑换汇率的基本币种。biz_scene是LOCAL场景下，该参数返回为空。
	 */
	@ApiField("base_currency")
	private String baseCurrency;

	/**
	 * 兑换汇率对应的兑换目标币种. LOCAL场景下为空
	 */
	@ApiField("exchange_currency")
	private String exchangeCurrency;

	/**
	 * 转账币种兑换结算币种的汇率。biz_scene是LOCAL场景下，该参数返回空。
	 */
	@ApiField("rate")
	private Long rate;

	public String getBaseCurrency() {
		return this.baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getExchangeCurrency() {
		return this.exchangeCurrency;
	}
	public void setExchangeCurrency(String exchangeCurrency) {
		this.exchangeCurrency = exchangeCurrency;
	}

	public Long getRate() {
		return this.rate;
	}
	public void setRate(Long rate) {
		this.rate = rate;
	}

}
