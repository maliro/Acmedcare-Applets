package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 商品描述信息
 *
 * @author auto create
 * @since 1.0, 2017-11-30 10:18:28
 */
public class RetailItemDescription extends AlipayObject {

	private static final long serialVersionUID = 5629149135755996893L;

	/**
	 * 标题下的描述列表，列表类型，每项不得超过100个中文字符,最多10项
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 商品描述title
	 */
	@ApiField("title")
	private String title;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
