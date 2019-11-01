package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * NFC用户卡信息同步
 *
 * @author auto create
 * @since 1.0, 2019-08-07 18:09:10
 */
public class AlipayCommerceTransportNfccardSendModel extends AlipayObject {

	private static final long serialVersionUID = 6671669777691592385L;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡片状态（FREEZE：冻结，CANCEL：销卡）
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 发卡机构代码
	 */
	@ApiField("issue_org_no")
	private String issueOrgNo;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getIssueOrgNo() {
		return this.issueOrgNo;
	}
	public void setIssueOrgNo(String issueOrgNo) {
		this.issueOrgNo = issueOrgNo;
	}

}
