package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询菜类
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:18:55
 */
public class KoubeiCateringPosCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6712293465374639157L;

	/**
	 * 分类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

}
