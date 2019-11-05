package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 运动单日汇总信息
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:32:54
 */
public class ExerciseDailySummaryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 6265781383715821729L;

	/**
	 * 时长：单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 目标类型:CARDIO，MUSCLE，FLEXIBILITY
	 */
	@ApiField("type")
	private String type;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
