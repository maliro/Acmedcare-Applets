package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 生产物料信息反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-08-10 21:02:52
 */
public class AntMerchantExpandAssetinfoProduceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5626817797668549636L;

	/**
	 * 传入需要反馈的物料信息对象列表。
	 */
	@ApiListField("asset_infos")
	@ApiField("asset_info_item")
	private List<AssetInfoItem> assetInfos;

	public List<AssetInfoItem> getAssetInfos() {
		return this.assetInfos;
	}
	public void setAssetInfos(List<AssetInfoItem> assetInfos) {
		this.assetInfos = assetInfos;
	}

}
