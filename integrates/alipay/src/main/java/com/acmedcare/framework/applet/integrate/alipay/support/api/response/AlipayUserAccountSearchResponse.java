package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AccountRecord;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserAccountSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8689637222433853357L;

	/** 
	 * 支付宝用户账务明细信息
	 */
	@ApiListField("account_records")
	@ApiField("account_record")
	private List<AccountRecord> accountRecords;

	/** 
	 * 总页面数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private Long totalResults;

	public void setAccountRecords(List<AccountRecord> accountRecords) {
		this.accountRecords = accountRecords;
	}
	public List<AccountRecord> getAccountRecords( ) {
		return this.accountRecords;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

}