package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 自定义数据报表规则详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:13
 */
public class KoubeiMarketingDataCustomreportDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4264649433731383644L;

	/**
	 * 自定义报表的规则KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	public String getConditionKey() {
		return this.conditionKey;
	}
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

}
