package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 会员报表批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:33:45
 */
public class KoubeiMarketingDataMemberReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8699542732914957343L;

	/**
	 * 查询报表数据的业务日期，精确到天，格式为yyyymmdd，数据按天返回
	 */
	@ApiField("biz_date")
	private String bizDate;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

}
