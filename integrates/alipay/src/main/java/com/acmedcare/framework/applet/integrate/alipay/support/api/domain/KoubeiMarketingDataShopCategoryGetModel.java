package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 获取商圈店铺分类
 *
 * @author auto create
 * @since 1.0, 2018-07-04 21:31:07
 */
public class KoubeiMarketingDataShopCategoryGetModel extends AlipayObject {

	private static final long serialVersionUID = 1731884436132564397L;

	/**
	 * 该参数标识需要返回几个分类，多余的分类将会放于other字段中，最大值传入50，默认值10
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}