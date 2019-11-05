package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 风险雷达添加商户联系方式列表接口
 *
 * @author auto create
 * @since 1.0, 2018-03-22 19:32:57
 */
public class ZhimaCreditEpEntityMonitorSetModel extends AlipayObject {

	private static final long serialVersionUID = 8881979268924143361L;

	/**
	 * 联系人列表
	 */
	@ApiField("contact_list")
	private String contactList;

	/**
	 * 方案ID
	 */
	@ApiField("solution_id")
	private String solutionId;

	public String getContactList() {
		return this.contactList;
	}
	public void setContactList(String contactList) {
		this.contactList = contactList;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
