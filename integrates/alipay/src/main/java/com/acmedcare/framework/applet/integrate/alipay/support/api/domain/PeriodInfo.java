package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 周期模型
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class PeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 1815749573669951142L;

	/**
	 * 单位
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 周期值
	 */
	@ApiField("value")
	private Long value;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
