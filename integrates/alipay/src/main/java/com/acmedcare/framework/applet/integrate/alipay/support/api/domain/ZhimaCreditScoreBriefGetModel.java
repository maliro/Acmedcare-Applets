package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 芝麻信用评分普惠版
 *
 * @author auto create
 * @since 1.0, 2018-03-14 21:12:30
 */
public class ZhimaCreditScoreBriefGetModel extends AlipayObject {

	private static final long serialVersionUID = 4213812839576984682L;

	/**
	 * 350～950之间 业务判断的准入标准 建议业务确定一个稳定的判断标准 频繁的变更该标准可能导致接口被停用
	 */
	@ApiField("admittance_score")
	private Long admittanceScore;

	/**
	 * 对应的证件号(未脱敏)或支付宝uid
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型 目前支持三种IDENTITY_CARD(身份证),PASSPORT(护照),ALIPAY_USER_ID(支付宝uid)
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/**
	 * 用户姓名 当证件类型为ALIPAY_USER_ID时不需要传入
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码，直接使用［示例］给出的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public Long getAdmittanceScore() {
		return this.admittanceScore;
	}
	public void setAdmittanceScore(Long admittanceScore) {
		this.admittanceScore = admittanceScore;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}
	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}