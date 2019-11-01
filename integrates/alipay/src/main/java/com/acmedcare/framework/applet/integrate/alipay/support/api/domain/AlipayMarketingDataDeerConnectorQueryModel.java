package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察数据
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:30:47
 */
public class AlipayMarketingDataDeerConnectorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8776334565265499893L;

	/**
	 * 活动洞察数据查询标识
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 数据请求的参数，比如活动投放日期、投放渠道等信息
	 */
	@ApiField("params")
	private String params;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}
