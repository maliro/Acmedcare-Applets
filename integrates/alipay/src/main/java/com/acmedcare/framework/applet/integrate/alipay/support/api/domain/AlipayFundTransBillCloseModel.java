package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 支付宝转账单据关闭接口
 *
 * @author auto create
 * @since 1.0, 2019-05-17 12:01:13
 */
public class AlipayFundTransBillCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2633879248752636615L;

	/**
	 * 支付宝转账单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getTransferNo() {
		return this.transferNo;
	}
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
