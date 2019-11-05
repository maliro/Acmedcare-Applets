package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 行业业务订单查询
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:29
 */
public class AlipayEbppIndustryOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8423755234235947568L;

	/**
	 * ISV流水号，用于控制幂等，须确保全局唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
