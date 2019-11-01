package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AssetDeliveryItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetdelivery.assign.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-04 15:11:30
 */
public class AntMerchantExpandAssetdeliveryAssignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4598346171475834275L;

	/** 
	 * 配送指令集合
	 */
	@ApiListField("asset_delivery_items")
	@ApiField("asset_delivery_item")
	private List<AssetDeliveryItem> assetDeliveryItems;

	/** 
	 * 当前是否还有配送指令可以拉取; 注意如果该值为false, 也只是提示当前时刻没有更多配送指令了, 不代表后面没有配送指令, 商户需要自己制定策略定时去拉取.
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	public void setAssetDeliveryItems(List<AssetDeliveryItem> assetDeliveryItems) {
		this.assetDeliveryItems = assetDeliveryItems;
	}
	public List<AssetDeliveryItem> getAssetDeliveryItems( ) {
		return this.assetDeliveryItems;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}
