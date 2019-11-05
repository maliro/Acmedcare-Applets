package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.guarantee.tradedrive.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-17 20:44:24
 */
public class MybankCreditGuaranteeTradedrivePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664276321417378382L;

	/** 
	 * 调用成功则返回调用业务编码
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
