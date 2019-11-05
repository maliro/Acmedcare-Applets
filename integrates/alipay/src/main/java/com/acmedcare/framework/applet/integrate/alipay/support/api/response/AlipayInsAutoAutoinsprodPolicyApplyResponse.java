package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsTradeInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.policy.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 17:08:38
 */
public class AlipayInsAutoAutoinsprodPolicyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5782783848314284253L;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/** 
	 * 车险订单交易信息
	 */
	@ApiListField("trade_infos")
	@ApiField("ins_trade_info")
	private List<InsTradeInfo> tradeInfos;

	/** 
	 * 吱口令
	 */
	@ApiField("zhi_link")
	private String zhiLink;

	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}
	public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

	public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}
	public String getQuoteBizId( ) {
		return this.quoteBizId;
	}

	public void setTradeInfos(List<InsTradeInfo> tradeInfos) {
		this.tradeInfos = tradeInfos;
	}
	public List<InsTradeInfo> getTradeInfos( ) {
		return this.tradeInfos;
	}

	public void setZhiLink(String zhiLink) {
		this.zhiLink = zhiLink;
	}
	public String getZhiLink( ) {
		return this.zhiLink;
	}

}
