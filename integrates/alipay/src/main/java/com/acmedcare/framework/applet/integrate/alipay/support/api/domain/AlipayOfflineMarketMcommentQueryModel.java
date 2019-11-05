package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询交易评价信息
 *
 * @author auto create
 * @since 1.0, 2016-06-13 20:25:02
 */
public class AlipayOfflineMarketMcommentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4219784785269462224L;

	/**
	 * 调用途径：
1：当值为ISV表示isv途径调用
2：当值为PROVIDER表示服务商调用
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 字段涵义：当前交易对应的商户partner_id
仅op_role='PROVIDER'必须传入
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
