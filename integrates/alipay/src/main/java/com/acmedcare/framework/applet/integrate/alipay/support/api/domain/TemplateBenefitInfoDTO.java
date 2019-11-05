package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;
import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 卡模板权益信息
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:04:30
 */
public class TemplateBenefitInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1317919416258532379L;

	/**
	 * 权益描述信息
	 */
	@ApiListField("benefit_desc")
	@ApiField("string")
	private List<String> benefitDesc;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 权益描述
	 */
	@ApiField("title")
	private String title;

	public List<String> getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
