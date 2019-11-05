package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExtCardInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.trusteeship.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-04 19:09:33
 */
public class AlipayFundTransTrusteeshipAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5731641255497499448L;

	/** 
	 * 开设的支付宝账号user_id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 场景余额模式外标卡信息
	 */
	@ApiField("ext_card_info")
	private ExtCardInfo extCardInfo;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setExtCardInfo(ExtCardInfo extCardInfo) {
		this.extCardInfo = extCardInfo;
	}
	public ExtCardInfo getExtCardInfo( ) {
		return this.extCardInfo;
	}

}
