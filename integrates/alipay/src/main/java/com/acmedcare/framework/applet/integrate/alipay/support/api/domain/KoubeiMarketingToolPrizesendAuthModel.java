package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 发券授权
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:45:06
 */
public class KoubeiMarketingToolPrizesendAuthModel extends AlipayObject {

	private static final long serialVersionUID = 1389366583593346762L;

	/**
	 * 奖品ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 外部流水号，保证业务幂等性
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 发奖用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
