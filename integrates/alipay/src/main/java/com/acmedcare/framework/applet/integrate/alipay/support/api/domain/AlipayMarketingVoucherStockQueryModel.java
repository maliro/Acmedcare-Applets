package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 外部商户券码券查询
 *
 * @author auto create
 * @since 1.0, 2018-02-02 14:45:45
 */
public class AlipayMarketingVoucherStockQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2536663335131113124L;

	/**
	 * 库存ID, 库存创建接口返回
	 */
	@ApiField("stock_id")
	private String stockId;

	public String getStockId() {
		return this.stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

}
