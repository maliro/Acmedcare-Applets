package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 批量请求结算
 *
 * @author auto create
 * @since 1.0, 2019-09-12 18:35:43
 */
public class AlipayTradeBatchSettleModel extends AlipayObject {

	private static final long serialVersionUID = 5264838796543234129L;

	/**
	 * 收单产品码，商家和支付宝签约的产品码
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复，如果重复则返回该流水号对应的结算单据的状态。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 结算明细条款
	 */
	@ApiListField("settle_clauses")
	@ApiField("settle_clause")
	private List<SettleClause> settleClauses;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<SettleClause> getSettleClauses() {
		return this.settleClauses;
	}
	public void setSettleClauses(List<SettleClause> settleClauses) {
		this.settleClauses = settleClauses;
	}

}
