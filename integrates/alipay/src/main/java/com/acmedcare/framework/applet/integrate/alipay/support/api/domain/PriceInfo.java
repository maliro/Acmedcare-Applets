package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品价格信息
 *
 * @author auto create
 * @since 1.0, 2018-11-28 22:09:08
 */
public class PriceInfo extends AlipayObject {

	private static final long serialVersionUID = 1125813129585765294L;

	/**
	 * 商品价格维度信息
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 价格，单位为元
	 */
	@ApiField("price")
	private String price;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
