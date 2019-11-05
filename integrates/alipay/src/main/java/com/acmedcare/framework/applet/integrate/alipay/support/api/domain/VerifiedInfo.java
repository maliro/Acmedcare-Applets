package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 泰国电子落地签审核结果信息。
VerifyInfo of EVOA application.
 *
 * @author auto create
 * @since 1.0, 2019-03-22 18:02:41
 */
public class VerifiedInfo extends AlipayObject {

	private static final long serialVersionUID = 8865343758217837599L;

	/**
	 * 用户申请订单号回传。
Unique Application No.
	 */
	@ApiField("application_no")
	private String applicationNo;

	/**
	 * 审核记录。
Note.
	 */
	@ApiField("note")
	private String note;

	/**
	 * 审核备注。
Remark.
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 审核状态：通过/拒绝。
Status of application：Verified/Rejected.
	 */
	@ApiField("status")
	private String status;

	/**
	 * 审核负责单位。
Name of user who do verify.
	 */
	@ApiField("verified_by")
	private String verifiedBy;

	/**
	 * 审核时间。
DateTime of verified or rejected.
	 */
	@ApiField("verify_date_time")
	private Date verifyDateTime;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getNote() {
		return this.note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerifiedBy() {
		return this.verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public Date getVerifyDateTime() {
		return this.verifyDateTime;
	}
	public void setVerifyDateTime(Date verifyDateTime) {
		this.verifyDateTime = verifyDateTime;
	}

}
