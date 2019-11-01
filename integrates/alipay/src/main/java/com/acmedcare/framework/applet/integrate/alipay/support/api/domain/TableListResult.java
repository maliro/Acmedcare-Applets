package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 桌名桌号返回结果类，桌号，桌名为成员
 *
 * @author auto create
 * @since 1.0, 2017-06-26 14:14:11
 */
public class TableListResult extends AlipayObject {

	private static final long serialVersionUID = 6521731434416355312L;

	/**
	 * 桌名
	 */
	@ApiField("table_name")
	private String tableName;

	/**
	 * 桌号
	 */
	@ApiField("table_num")
	private String tableNum;

	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableNum() {
		return this.tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

}
