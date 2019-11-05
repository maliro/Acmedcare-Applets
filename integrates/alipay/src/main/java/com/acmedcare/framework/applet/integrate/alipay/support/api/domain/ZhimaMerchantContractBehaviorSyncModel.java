package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 芝麻信用承诺消费用户履约信息同步接口
 *
 * @author auto create
 * @since 1.0, 2019-03-21 20:37:48
 */
public class ZhimaMerchantContractBehaviorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1143619692218358847L;

	/**
	 * 履约动作发生时间，如果重试需要保证为首次动作发生的时间
	 */
	@ApiField("action_time")
	private String actionTime;

	/**
	 * 履约接口操作类型，必须在以下列表中：
CREATE - 创建履约
FINISH - 完成履约
CANCEL - 取消履约
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 承诺消费合约号，唯一定位用户的一笔合约
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 商户业务订单号。使用pid+out_biz_no做幂等。每次反馈pid+out_biz_no需保持唯一，重试除外。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝交易单号，由支付宝交易接口生成，唯一定位一次交易。如果合约涉及支付宝交易，必传
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易订单金额，单位为分，表示该次履约的订单金额，与trade_no配合使用
	 */
	@ApiField("trade_order_amount")
	private String tradeOrderAmount;

	/**
	 * 蚂蚁统一会员ID，唯一键标识用户身份。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeOrderAmount() {
		return this.tradeOrderAmount;
	}
	public void setTradeOrderAmount(String tradeOrderAmount) {
		this.tradeOrderAmount = tradeOrderAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
