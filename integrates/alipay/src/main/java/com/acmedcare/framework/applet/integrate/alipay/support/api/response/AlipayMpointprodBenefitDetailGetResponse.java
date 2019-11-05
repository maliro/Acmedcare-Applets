package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BenefitInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mpointprod.benefit.detail.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMpointprodBenefitDetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1478215345567577921L;

	/** 
	 * 权益详情列表
	 */
	@ApiListField("benefit_infos")
	@ApiField("benefit_info")
	private List<BenefitInfo> benefitInfos;

	/** 
	 * 响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 响应描述
	 */
	@ApiField("msg")
	private String msg;

	public void setBenefitInfos(List<BenefitInfo> benefitInfos) {
		this.benefitInfos = benefitInfos;
	}
	public List<BenefitInfo> getBenefitInfos( ) {
		return this.benefitInfos;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
