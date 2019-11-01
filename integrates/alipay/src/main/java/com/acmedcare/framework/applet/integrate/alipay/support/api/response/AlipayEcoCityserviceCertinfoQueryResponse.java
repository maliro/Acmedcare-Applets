package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CertInfoResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.certinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-23 15:33:14
 */
public class AlipayEcoCityserviceCertinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2496432879239425981L;

	/** 
	 * 用户证件信息查询结果列表。列表中的元素包含请求证件信息，以及对应的支付宝uid信息。
	 */
	@ApiListField("result_list")
	@ApiField("cert_info_response")
	private List<CertInfoResponse> resultList;

	public void setResultList(List<CertInfoResponse> resultList) {
		this.resultList = resultList;
	}
	public List<CertInfoResponse> getResultList( ) {
		return this.resultList;
	}

}
