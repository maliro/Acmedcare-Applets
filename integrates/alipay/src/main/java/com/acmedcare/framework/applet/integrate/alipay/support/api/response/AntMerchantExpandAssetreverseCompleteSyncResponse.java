package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AssetResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.assetreverse.complete.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntMerchantExpandAssetreverseCompleteSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1398238521774788354L;

	/** 
	 * 取消订单或者退货已经完成时，响应参数
	 */
	@ApiListField("asset_results")
	@ApiField("asset_result")
	private List<AssetResult> assetResults;

	public void setAssetResults(List<AssetResult> assetResults) {
		this.assetResults = assetResults;
	}
	public List<AssetResult> getAssetResults( ) {
		return this.assetResults;
	}

}
