package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TrusteeshipAccountBillQueryResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-24 17:50:17
 */
public class AlipayFundAccountBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8363667449348832617L;

	/** 
	 * 账单详情
	 */
	@ApiListField("acc_detail_list")
	@ApiField("trusteeship_account_bill_query_response")
	private List<TrusteeshipAccountBillQueryResponse> accDetailList;

	/** 
	 * 结果页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 结果页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 每页元素数
	 */
	@ApiField("total_item_count")
	private String totalItemCount;

	public void setAccDetailList(List<TrusteeshipAccountBillQueryResponse> accDetailList) {
		this.accDetailList = accDetailList;
	}
	public List<TrusteeshipAccountBillQueryResponse> getAccDetailList( ) {
		return this.accDetailList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalItemCount(String totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	public String getTotalItemCount( ) {
		return this.totalItemCount;
	}

}
