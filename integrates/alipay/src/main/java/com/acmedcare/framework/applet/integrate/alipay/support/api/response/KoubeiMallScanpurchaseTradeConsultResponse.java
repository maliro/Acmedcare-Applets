package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MallDiscountDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.trade.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-31 16:19:17
 */
public class KoubeiMallScanpurchaseTradeConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6279248489645969632L;

	/** 
	 * 用户实付金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 优惠信息
	 */
	@ApiListField("discount_detail")
	@ApiField("mall_discount_detail")
	private List<MallDiscountDetail> discountDetail;

	/** 
	 * 请求中的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setDiscountDetail(List<MallDiscountDetail> discountDetail) {
		this.discountDetail = discountDetail;
	}
	public List<MallDiscountDetail> getDiscountDetail( ) {
		return this.discountDetail;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
