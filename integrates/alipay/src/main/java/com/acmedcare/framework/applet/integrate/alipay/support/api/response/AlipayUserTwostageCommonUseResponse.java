package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.twostage.common.use response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-06 14:55:01
 */
public class AlipayUserTwostageCommonUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6295277657942291812L;

	/** 
	 * 支付宝用户userId信息，因为用户已经在客户端给商户的小程序授权了，并且商户要通过userId信息挂接优惠券信息，所以可以无需脱敏返回给商户。
	 */
	@ApiField("user_id")
	private String userId;

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
