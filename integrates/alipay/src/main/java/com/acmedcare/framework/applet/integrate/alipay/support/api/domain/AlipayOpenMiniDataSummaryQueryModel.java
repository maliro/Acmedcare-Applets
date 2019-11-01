package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序整体概况数据查询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 16:57:44
 */
public class AlipayOpenMiniDataSummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7846897425365737653L;

	/**
	 * 请求数据的日期
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
