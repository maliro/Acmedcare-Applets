package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OpenApiSignQueryResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.agreement.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-06 14:17:40
 */
public class AlipayUserAgreementBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1487341949927727519L;

	/** 
	 * 用户签约协议列表
	 */
	@ApiListField("usage_agreement_info_list")
	@ApiField("open_api_sign_query_response")
	private List<OpenApiSignQueryResponse> usageAgreementInfoList;

	public void setUsageAgreementInfoList(List<OpenApiSignQueryResponse> usageAgreementInfoList) {
		this.usageAgreementInfoList = usageAgreementInfoList;
	}
	public List<OpenApiSignQueryResponse> getUsageAgreementInfoList( ) {
		return this.usageAgreementInfoList;
	}

}
