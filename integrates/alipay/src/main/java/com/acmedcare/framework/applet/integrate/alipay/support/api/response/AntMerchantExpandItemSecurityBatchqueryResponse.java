package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CmItemInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.security.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-06 21:55:10
 */
public class AntMerchantExpandItemSecurityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3763449757521983653L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("cm_item_info")
	private List<CmItemInfo> itemList;

	public void setItemList(List<CmItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<CmItemInfo> getItemList( ) {
		return this.itemList;
	}

}
