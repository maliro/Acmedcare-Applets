package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 监控共建自定义指标数据结构
 *
 * @author auto create
 * @since 1.0, 2019-03-12 10:43:36
 */
public class CustomMetric extends AlipayObject {

	private static final long serialVersionUID = 6769354744746618332L;

	/**
	 * 监控共建自定义指标数据产生的时间戳
	 */
	@ApiField("biz_time")
	private Long bizTime;

	/**
	 * 监控共建自定义指标维度集合
	 */
	@ApiListField("dimensions")
	@ApiField("dimension")
	private List<Dimension> dimensions;

	/**
	 * 监控共建自定义指标名称
	 */
	@ApiField("metric_name")
	private String metricName;

	/**
	 * 监控共建自定义指标值
	 */
	@ApiField("value")
	private String value;

	public Long getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Long bizTime) {
		this.bizTime = bizTime;
	}

	public List<Dimension> getDimensions() {
		return this.dimensions;
	}
	public void setDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;
	}

	public String getMetricName() {
		return this.metricName;
	}
	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
