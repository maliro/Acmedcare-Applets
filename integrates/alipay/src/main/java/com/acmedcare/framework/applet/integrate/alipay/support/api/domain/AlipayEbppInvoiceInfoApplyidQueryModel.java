package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 根据发票申请id查询发票信息
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:01:48
 */
public class AlipayEbppInvoiceInfoApplyidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3153748368447584731L;

	/**
	 * 申请开票时支付宝返回的申请id，具有全局唯一性。
	 */
	@ApiField("apply_id")
	private String applyId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

}
