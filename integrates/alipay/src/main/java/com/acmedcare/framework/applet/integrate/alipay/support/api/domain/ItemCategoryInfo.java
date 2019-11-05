package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商品类目信息
 *
 * @author auto create
 * @since 1.0, 2018-11-28 22:09:08
 */
public class ItemCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 2382362838384612773L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类目层级
	 */
	@ApiField("category_level")
	private Long categoryLevel;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryLevel() {
		return this.categoryLevel;
	}
	public void setCategoryLevel(Long categoryLevel) {
		this.categoryLevel = categoryLevel;
	}

}
