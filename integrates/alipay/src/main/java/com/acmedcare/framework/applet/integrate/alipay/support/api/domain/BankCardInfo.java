package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 银行卡信息
 *
 * @author auto create
 * @since 1.0, 2018-11-19 13:05:56
 */
public class BankCardInfo extends AlipayObject {

	private static final long serialVersionUID = 2819248952152588225L;

	/**
	 * 银行开户行名称。填写支行名称。
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 银行卡持卡人姓名
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 银行卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
