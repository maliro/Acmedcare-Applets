package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 券状态查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:31:38
 */
public class AlipayOfflineMarketingVoucherStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2665156165663458321L;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券模板id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
