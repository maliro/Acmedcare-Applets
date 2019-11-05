package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AssetReverseItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetreverse.assign.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntMerchantExpandAssetreverseAssignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4689275821195845127L;

	/** 
	 * 逆向指令集合
	 */
	@ApiListField("asset_reverse_items")
	@ApiField("asset_reverse_item")
	private List<AssetReverseItem> assetReverseItems;

	/** 
	 * 当前是否还有配送指令可以拉取; 注意如果该值为false, 也只是提示当前时刻没有更多配送指令了, 不代表后面没有配送指令, 商户需要自己制定策略定时去拉取.
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	public void setAssetReverseItems(List<AssetReverseItem> assetReverseItems) {
		this.assetReverseItems = assetReverseItems;
	}
	public List<AssetReverseItem> getAssetReverseItems( ) {
		return this.assetReverseItems;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}
