package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsDataAutodamageEstimateResultDetailModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.autodamage.estimate.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsDataAutodamageEstimateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8239447912532138918L;

	/** 
	 * 商业险保单号
	 */
	@ApiField("commercial_policy_no")
	private String commercialPolicyNo;

	/** 
	 * 交强险
	 */
	@ApiField("compulsory_policy_no")
	private String compulsoryPolicyNo;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/** 
	 * 定损结果详情列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_autodamage_estimate_result_detail_model")
	private List<InsDataAutodamageEstimateResultDetailModel> estimateDetailList;

	/** 
	 * 定损单号
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/** 
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/** 
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/** 
	 * 车型厂牌
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/** 
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/** 
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

	public void setCommercialPolicyNo(String commercialPolicyNo) {
		this.commercialPolicyNo = commercialPolicyNo;
	}
	public String getCommercialPolicyNo( ) {
		return this.commercialPolicyNo;
	}

	public void setCompulsoryPolicyNo(String compulsoryPolicyNo) {
		this.compulsoryPolicyNo = compulsoryPolicyNo;
	}
	public String getCompulsoryPolicyNo( ) {
		return this.compulsoryPolicyNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getEngineNo( ) {
		return this.engineNo;
	}

	public void setEstimateDetailList(List<InsDataAutodamageEstimateResultDetailModel> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}
	public List<InsDataAutodamageEstimateResultDetailModel> getEstimateDetailList( ) {
		return this.estimateDetailList;
	}

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}
	public String getEstimateNo( ) {
		return this.estimateNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}
	public String getFrameNo( ) {
		return this.frameNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getLicenseNo( ) {
		return this.licenseNo;
	}

	public void setModelBrand(String modelBrand) {
		this.modelBrand = modelBrand;
	}
	public String getModelBrand( ) {
		return this.modelBrand;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getReportNo( ) {
		return this.reportNo;
	}

	public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}
	public String getSurveyNo( ) {
		return this.surveyNo;
	}

}
