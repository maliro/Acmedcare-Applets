package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 保存操作和文本字段
 *
 * @author auto create
 * @since 1.0, 2019-08-22 17:31:37
 */
public class TextDiff extends AlipayObject {

	private static final long serialVersionUID = 1225658578728926581L;

	/**
	 * 操作类型
	 */
	@ApiField("operation")
	private String operation;

	/**
	 * 文本内容
	 */
	@ApiField("text")
	private String text;

	public String getOperation() {
		return this.operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
