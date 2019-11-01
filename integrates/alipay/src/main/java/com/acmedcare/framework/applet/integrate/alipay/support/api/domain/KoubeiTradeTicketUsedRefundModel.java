package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑凭证售后退
 *
 * @author auto create
 * @since 1.0, 2019-08-16 14:57:33
 */
public class KoubeiTradeTicketUsedRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4784257714585464286L;

	/**
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 凭证码，包括内部凭证码和外部凭证码，内部凭证码为12位，纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/**
	 * 券核销流水号，针对该次核销发起售后退操作
	 */
	@ApiField("trans_id")
	private String transId;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTicketCode() {
		return this.ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}

	public String getTransId() {
		return this.transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}

}
