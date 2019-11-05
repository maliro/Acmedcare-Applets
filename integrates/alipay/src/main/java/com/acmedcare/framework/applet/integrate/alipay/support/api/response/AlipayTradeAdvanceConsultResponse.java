package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.WaitRepaymentOrderInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.advance.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-25 12:11:45
 */
public class AlipayTradeAdvanceConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5872248665815414192L;

	/** 
	 * true 代表当前时间点，用户允许垫资
false 代表当前时间，用户不允许垫资
	 */
	@ApiField("refer_result")
	private Boolean referResult;

	/** 
	 * 用户被注销
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回用户不准入原因
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 用户剩余的总待还金额，无论当前用户是否允许垫资，都会返回改属性
	 */
	@ApiField("wait_repayment_amount")
	private String waitRepaymentAmount;

	/** 
	 * 用户总的未还的垫资笔数，无论用户是否允许垫资，都会返回该属性
	 */
	@ApiField("wait_repayment_order_count")
	private Long waitRepaymentOrderCount;

	/** 
	 * 待还订单列表，无论用户当前状态是否允许垫资，都会返回当前用户在商户下的待还订单信息
	 */
	@ApiListField("wait_repayment_order_infos")
	@ApiField("wait_repayment_order_info")
	private List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos;

	public void setReferResult(Boolean referResult) {
		this.referResult = referResult;
	}
	public Boolean getReferResult( ) {
		return this.referResult;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

	public void setWaitRepaymentAmount(String waitRepaymentAmount) {
		this.waitRepaymentAmount = waitRepaymentAmount;
	}
	public String getWaitRepaymentAmount( ) {
		return this.waitRepaymentAmount;
	}

	public void setWaitRepaymentOrderCount(Long waitRepaymentOrderCount) {
		this.waitRepaymentOrderCount = waitRepaymentOrderCount;
	}
	public Long getWaitRepaymentOrderCount( ) {
		return this.waitRepaymentOrderCount;
	}

	public void setWaitRepaymentOrderInfos(List<WaitRepaymentOrderInfo> waitRepaymentOrderInfos) {
		this.waitRepaymentOrderInfos = waitRepaymentOrderInfos;
	}
	public List<WaitRepaymentOrderInfo> getWaitRepaymentOrderInfos( ) {
		return this.waitRepaymentOrderInfos;
	}

}
