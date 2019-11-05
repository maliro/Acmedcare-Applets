package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 券下架
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:14
 */
public class AlipayOfflineMarketingVoucherOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6767122279445313478L;

	/**
	 * 下架描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部流水号.需商家自己生成并保证每次请求的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券模板编号
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

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
