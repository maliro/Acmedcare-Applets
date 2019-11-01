package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 国家制裁数据受理接口
 *
 * @author auto create
 * @since 1.0, 2017-11-28 21:58:58
 */
public class AlipayAccountExrateSentimentDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 5667369724218829233L;

	/**
	 * 国家制裁提交数据内容
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
