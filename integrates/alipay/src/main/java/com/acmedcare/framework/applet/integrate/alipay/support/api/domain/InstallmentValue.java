package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 分段数值，用于存储分期费用和分段还款的分段值
 *
 * @author auto create
 * @since 1.0, 2017-05-19 11:45:39
 */
public class InstallmentValue extends AlipayObject {

	private static final long serialVersionUID = 8866954319663299299L;

	/**
	 * 分段值
	 */
	@ApiListField("installment_values")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> installmentValues;

	public List<InstallmentMetaInfo> getInstallmentValues() {
		return this.installmentValues;
	}
	public void setInstallmentValues(List<InstallmentMetaInfo> installmentValues) {
		this.installmentValues = installmentValues;
	}

}
