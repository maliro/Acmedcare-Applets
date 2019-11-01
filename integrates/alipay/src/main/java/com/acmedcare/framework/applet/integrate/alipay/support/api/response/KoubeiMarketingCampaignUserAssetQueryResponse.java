package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.VoucherDetailInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.user.asset.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignUserAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8477962284923377231L;

	/** 
	 * 券资产详情信息
	 */
	@ApiListField("voucher_asset_list")
	@ApiField("voucher_detail_info")
	private List<VoucherDetailInfo> voucherAssetList;

	/** 
	 * 券资产数量
	 */
	@ApiField("voucher_asset_num")
	private Long voucherAssetNum;

	public void setVoucherAssetList(List<VoucherDetailInfo> voucherAssetList) {
		this.voucherAssetList = voucherAssetList;
	}
	public List<VoucherDetailInfo> getVoucherAssetList( ) {
		return this.voucherAssetList;
	}

	public void setVoucherAssetNum(Long voucherAssetNum) {
		this.voucherAssetNum = voucherAssetNum;
	}
	public Long getVoucherAssetNum( ) {
		return this.voucherAssetNum;
	}

}
