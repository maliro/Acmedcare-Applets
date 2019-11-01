package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ebpp通用订单查询
 *
 * @author auto create
 * @since 1.0, 2019-05-10 10:30:04
 */
public class AlipayEbppCommonBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8216377998954833634L;

	/**
	 * 支付宝账单流水号（取自创建账单接口返回的alipay_order_no字段）
	 */
	@ApiField("bill_no")
	private String billNo;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

}
