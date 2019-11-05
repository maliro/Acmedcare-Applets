package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.RepayDetailVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repay.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanRepayDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5659987452175376789L;

	/** 
	 * 还款流水明细列表
	 */
	@ApiListField("repay_detail_list")
	@ApiField("repay_detail_v_o")
	private List<RepayDetailVO> repayDetailList;

	/** 
	 * 结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setRepayDetailList(List<RepayDetailVO> repayDetailList) {
		this.repayDetailList = repayDetailList;
	}
	public List<RepayDetailVO> getRepayDetailList( ) {
		return this.repayDetailList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
