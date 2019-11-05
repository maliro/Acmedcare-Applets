package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 店铺分类结构
 *
 * @author auto create
 * @since 1.0, 2018-07-04 21:31:07
 */
public class Category extends AlipayObject {

	private static final long serialVersionUID = 2139248121744352155L;

	/**
	 * 店铺分类ID集合
	 */
	@ApiListField("shop_cate_ids")
	@ApiField("string")
	private List<String> shopCateIds;

	/**
	 * 美食/娱乐等分类条目
	 */
	@ApiField("shop_cate_name")
	private String shopCateName;

	public List<String> getShopCateIds() {
		return this.shopCateIds;
	}
	public void setShopCateIds(List<String> shopCateIds) {
		this.shopCateIds = shopCateIds;
	}

	public String getShopCateName() {
		return this.shopCateName;
	}
	public void setShopCateName(String shopCateName) {
		this.shopCateName = shopCateName;
	}

}
