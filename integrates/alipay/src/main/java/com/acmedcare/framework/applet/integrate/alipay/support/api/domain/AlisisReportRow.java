package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 报表行对象
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:15
 */
public class AlisisReportRow extends AlipayObject {

	private static final long serialVersionUID = 3477846189285712225L;

	/**
	 * 报表行信息，每个对象是一列的数据
	 */
	@ApiListField("row_data")
	@ApiField("alisis_report_column")
	private List<AlisisReportColumn> rowData;

	public List<AlisisReportColumn> getRowData() {
		return this.rowData;
	}
	public void setRowData(List<AlisisReportColumn> rowData) {
		this.rowData = rowData;
	}

}
