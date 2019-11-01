package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 关闭蚂蚁档案客户关联
 *
 * @author auto create
 * @since 1.0, 2019-03-15 17:51:54
 */
public class AlipayUserAntarchiveCustrelationCloseModel extends AlipayObject {

	private static final long serialVersionUID = 2611439828686239847L;

	/**
	 * 关闭时间,可空.标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("close_date")
	private Date closeDate;

	/**
	 * 待关闭蚂蚁档案关联的客户id
	 */
	@ApiField("cust_id")
	private String custId;

	public Date getCloseDate() {
		return this.closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public String getCustId() {
		return this.custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}

}
