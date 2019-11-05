package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 国开行助学贷款还款计划查询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:51:13
 */
public class AlipayFundStudentloanRepayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3239169859847676856L;

	/**
	 * 还款学生的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 还款学生的支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
