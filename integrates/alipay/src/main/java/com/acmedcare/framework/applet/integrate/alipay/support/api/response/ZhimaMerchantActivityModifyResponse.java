package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-14 21:05:01
 */
public class ZhimaMerchantActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1873438827875368799L;

	/** 
	 * 芝麻活动号
	 */
	@ApiField("activity_no")
	private String activityNo;

	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}
	public String getActivityNo( ) {
		return this.activityNo;
	}

}
