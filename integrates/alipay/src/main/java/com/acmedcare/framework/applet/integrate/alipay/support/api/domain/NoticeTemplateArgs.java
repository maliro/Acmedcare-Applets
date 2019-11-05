package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 通知内容模板
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:05
 */
public class NoticeTemplateArgs extends AlipayObject {

	private static final long serialVersionUID = 6875818932274787336L;

	/**
	 * 课程开始时间
	 */
	@ApiField("course_start_time")
	private Date courseStartTime;

	public Date getCourseStartTime() {
		return this.courseStartTime;
	}
	public void setCourseStartTime(Date courseStartTime) {
		this.courseStartTime = courseStartTime;
	}

}
