package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商户行业资质，教育缴费行业必填
 *
 * @author auto create
 * @since 1.0, 2018-12-13 16:57:26
 */
public class IndustryQualificationInfoKt extends AlipayObject {

	private static final long serialVersionUID = 3269445824177495999L;

	/**
	 * 商户行业资质图片URL，格式jpg、jpeg、png
	 */
	@ApiField("industry_qualification_image")
	private String industryQualificationImage;

	/**
	 * 商户行业资质类型，具体选值参见https://mif-pub.alipayobjects.com/QualificationType.xlsx
	 */
	@ApiField("industry_qualification_type")
	private String industryQualificationType;

	public String getIndustryQualificationImage() {
		return this.industryQualificationImage;
	}
	public void setIndustryQualificationImage(String industryQualificationImage) {
		this.industryQualificationImage = industryQualificationImage;
	}

	public String getIndustryQualificationType() {
		return this.industryQualificationType;
	}
	public void setIndustryQualificationType(String industryQualificationType) {
		this.industryQualificationType = industryQualificationType;
	}

}
