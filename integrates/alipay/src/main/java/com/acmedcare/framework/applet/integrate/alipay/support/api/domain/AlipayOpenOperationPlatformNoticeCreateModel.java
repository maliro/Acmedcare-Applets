package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 开放平台openhome创建站内信
 *
 * @author auto create
 * @since 1.0, 2019-01-18 16:18:17
 */
public class AlipayOpenOperationPlatformNoticeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2166679393693494778L;

	/**
	 * 站内信内容字段
	 */
	@ApiField("notice_content")
	private String noticeContent;

	/**
	 * 站内信title字段
	 */
	@ApiField("notice_title")
	private String noticeTitle;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	public String getNoticeContent() {
		return this.noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeTitle() {
		return this.noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
