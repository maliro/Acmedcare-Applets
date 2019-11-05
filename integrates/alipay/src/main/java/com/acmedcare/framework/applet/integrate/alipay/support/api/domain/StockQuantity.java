package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 库存查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:51
 */
public class StockQuantity extends AlipayObject {

	private static final long serialVersionUID = 5227216334428865272L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 库存量
	 */
	@ApiField("quantity")
	private Long quantity;

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
