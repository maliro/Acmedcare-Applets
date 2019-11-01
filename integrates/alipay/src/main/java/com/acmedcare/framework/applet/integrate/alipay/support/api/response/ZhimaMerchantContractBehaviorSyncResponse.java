package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.behavior.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-21 20:45:00
 */
public class ZhimaMerchantContractBehaviorSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7137961579768598963L;

	/** 
	 * 商户业务订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
