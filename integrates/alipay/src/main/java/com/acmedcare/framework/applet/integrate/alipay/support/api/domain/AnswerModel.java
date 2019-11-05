package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 问卷单道题答案数据模型
 *
 * @author auto create
 * @since 1.0, 2018-09-19 16:54:40
 */
public class AnswerModel extends AlipayObject {

	private static final long serialVersionUID = 6869441493417893239L;

	/**
	 * 供填空和问卷内容提交的附加项
	 */
	@ApiField("extra")
	private String extra;

	/**
	 * 问题id信息
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * 选项id
	 */
	@ApiField("option_id")
	private Long optionId;

	public String getExtra() {
		return this.extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getOptionId() {
		return this.optionId;
	}
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

}
