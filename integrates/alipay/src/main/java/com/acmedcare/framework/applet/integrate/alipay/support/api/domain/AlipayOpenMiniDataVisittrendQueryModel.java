package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序访问趋势实时数据查询
 *
 * @author auto create
 * @since 1.0, 2019-06-20 16:57:27
 */
public class AlipayOpenMiniDataVisittrendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2234173599121352825L;

	/**
	 * 查询小程序访问趋势数据的粒度，如HOUR-小时级
	 */
	@ApiField("time_unit")
	private String timeUnit;

	public String getTimeUnit() {
		return this.timeUnit;
	}
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

}
