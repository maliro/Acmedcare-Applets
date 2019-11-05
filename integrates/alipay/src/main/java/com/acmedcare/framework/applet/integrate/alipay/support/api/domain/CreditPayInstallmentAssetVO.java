package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 信用支付贷款分期资产视图
 *
 * @author auto create
 * @since 1.0, 2019-07-12 16:20:27
 */
public class CreditPayInstallmentAssetVO extends AlipayObject {

	private static final long serialVersionUID = 6825391434979724629L;

	/**
	 * 信用支付资产详情基础信息
	 */
	@ApiField("base_info")
	private CreditPayAssetBaseVO baseInfo;

	/**
	 * 分期详情
	 */
	@ApiListField("installment_details")
	@ApiField("credit_pay_installment_detail_v_o")
	private List<CreditPayInstallmentDetailVO> installmentDetails;

	public CreditPayAssetBaseVO getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(CreditPayAssetBaseVO baseInfo) {
		this.baseInfo = baseInfo;
	}

	public List<CreditPayInstallmentDetailVO> getInstallmentDetails() {
		return this.installmentDetails;
	}
	public void setInstallmentDetails(List<CreditPayInstallmentDetailVO> installmentDetails) {
		this.installmentDetails = installmentDetails;
	}

}
