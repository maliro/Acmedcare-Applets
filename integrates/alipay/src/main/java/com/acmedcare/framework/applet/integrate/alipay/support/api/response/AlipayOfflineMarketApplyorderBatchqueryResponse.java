package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BizOrderQueryResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.applyorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketApplyorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1663676753993612196L;

	/** 
	 * 支付宝操作流水信息列表
	 */
	@ApiListField("biz_order_infos")
	@ApiField("biz_order_query_response")
	private List<BizOrderQueryResponse> bizOrderInfos;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_page_no")
	private Long totalPageNo;

	public void setBizOrderInfos(List<BizOrderQueryResponse> bizOrderInfos) {
		this.bizOrderInfos = bizOrderInfos;
	}
	public List<BizOrderQueryResponse> getBizOrderInfos( ) {
		return this.bizOrderInfos;
	}

	public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public Long getCurrentPageNo( ) {
		return this.currentPageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPageNo(Long totalPageNo) {
		this.totalPageNo = totalPageNo;
	}
	public Long getTotalPageNo( ) {
		return this.totalPageNo;
	}

}
