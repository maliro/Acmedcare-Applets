package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 前台类目删除
 *
 * @author auto create
 * @since 1.0, 2019-09-06 14:21:24
 */
public class AntMerchantExpandFrontcategorySecurityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6617558818956498251L;

	/**
	 * 前台类目ID
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

}
