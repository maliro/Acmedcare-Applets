package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * isv 回传的门店商品信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class KoubeiRetailShopitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4591985595425123592L;

	/**
	 * 查询店铺商品查询入参
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item_query")
	private List<RequestExtShopItemQuery> shopItems;

	public List<RequestExtShopItemQuery> getShopItems() {
		return this.shopItems;
	}
	public void setShopItems(List<RequestExtShopItemQuery> shopItems) {
		this.shopItems = shopItems;
	}

}
