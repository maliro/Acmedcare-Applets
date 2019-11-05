package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 垃圾数据
 *
 * @author auto create
 * @since 1.0, 2019-07-22 12:37:51
 */
public class RubbishDTO extends AlipayObject {

	private static final long serialVersionUID = 2661645119914739647L;

	/**
	 * 垃圾类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 垃圾名称
	 */
	@ApiField("key_word")
	private String keyWord;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

}
