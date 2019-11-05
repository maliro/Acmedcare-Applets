package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 申请相关的发票抬头模型
 *
 * @author auto create
 * @since 1.0, 2019-06-21 17:06:19
 */
public class InvoiceTitleApplyOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2741314346854873423L;

	/**
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 开户行账户
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/**
	 * 购买方开户银行
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购买方纳税人识别号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 购买方电话
	 */
	@ApiField("payer_tel")
	private String payerTel;

	/**
	 * 发票抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	public String getPayerAddress() {
		return this.payerAddress;
	}
	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerBankAccount() {
		return this.payerBankAccount;
	}
	public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}

	public String getPayerBankName() {
		return this.payerBankName;
	}
	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getPayerTel() {
		return this.payerTel;
	}
	public void setPayerTel(String payerTel) {
		this.payerTel = payerTel;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
