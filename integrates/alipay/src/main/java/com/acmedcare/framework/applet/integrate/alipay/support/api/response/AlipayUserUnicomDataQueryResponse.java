package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserUnicomDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3145568948197366884L;

	/** 
	 * 蚂蚁宝卡流量余额，单位M
	 */
	@ApiField("data_balance")
	private Long dataBalance;

	public void setDataBalance(Long dataBalance) {
		this.dataBalance = dataBalance;
	}
	public Long getDataBalance( ) {
		return this.dataBalance;
	}

}
