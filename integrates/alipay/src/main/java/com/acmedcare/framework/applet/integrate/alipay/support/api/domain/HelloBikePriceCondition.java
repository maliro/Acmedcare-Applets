package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 价格限定条件，用于不同优惠卡之间的价格不等式约束。

每个算式含义如下
card_type_left * coefficient_left >= card_type_right * coefficient_right

举例 ycard * 0.08333 >= mcard * 0.8  （0.08333 = 1/12）
 *
 * @author auto create
 * @since 1.0, 2018-11-29 15:49:29
 */
public class HelloBikePriceCondition extends AlipayObject {

	private static final long serialVersionUID = 6816371527182265556L;

	/**
	 * 算式左侧优惠卡类型，枚举值为 mcard,qcard,hycard,ycard,tcard
	 */
	@ApiField("card_type_left")
	private String cardTypeLeft;

	/**
	 * 算式右侧优惠卡类型，枚举值为 mcard,qcard,hycard,ycard,tcard
	 */
	@ApiField("card_type_right")
	private String cardTypeRight;

	/**
	 * 算式左侧系数，字符串表示的浮点数，保留5位小数
	 */
	@ApiField("coefficient_left")
	private String coefficientLeft;

	/**
	 * 算式右侧系数，字符串表示的浮点数，保留5位小数
	 */
	@ApiField("coefficient_right")
	private String coefficientRight;

	public String getCardTypeLeft() {
		return this.cardTypeLeft;
	}
	public void setCardTypeLeft(String cardTypeLeft) {
		this.cardTypeLeft = cardTypeLeft;
	}

	public String getCardTypeRight() {
		return this.cardTypeRight;
	}
	public void setCardTypeRight(String cardTypeRight) {
		this.cardTypeRight = cardTypeRight;
	}

	public String getCoefficientLeft() {
		return this.coefficientLeft;
	}
	public void setCoefficientLeft(String coefficientLeft) {
		this.coefficientLeft = coefficientLeft;
	}

	public String getCoefficientRight() {
		return this.coefficientRight;
	}
	public void setCoefficientRight(String coefficientRight) {
		this.coefficientRight = coefficientRight;
	}

}
