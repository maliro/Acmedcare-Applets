package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlisisReport;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingDataAlisisReportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6696648289176959137L;

	/** 
	 * 报表列表信息
	 */
	@ApiListField("report_list")
	@ApiField("alisis_report")
	private List<AlisisReport> reportList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setReportList(List<AlisisReport> reportList) {
		this.reportList = reportList;
	}
	public List<AlisisReport> getReportList( ) {
		return this.reportList;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
