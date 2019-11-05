package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 取消订单或退货指令接收反馈接口
 *
 * @author auto create
 * @since 1.0, 2018-09-19 14:08:28
 */
public class AntMerchantExpandAssetreverseAssignSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6865231557523153728L;

	/**
	 * 取消订单或退货指令接收反馈，最多200条
	 */
	@ApiListField("reverse_results")
	@ApiField("asset_result")
	private List<AssetResult> reverseResults;

	public List<AssetResult> getReverseResults() {
		return this.reverseResults;
	}
	public void setReverseResults(List<AssetResult> reverseResults) {
		this.reverseResults = reverseResults;
	}

}
