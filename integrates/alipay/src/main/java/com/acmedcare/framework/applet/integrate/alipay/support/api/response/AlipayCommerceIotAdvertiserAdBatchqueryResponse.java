package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CreationPlanData;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.ad.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:13:07
 */
public class AlipayCommerceIotAdvertiserAdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3215138784785734152L;

	/** 
	 * 投放计划列表数组
	 */
	@ApiListField("result")
	@ApiField("creation_plan_data")
	private List<CreationPlanData> result;

	/** 
	 * 计划总数
	 */
	@ApiField("total")
	private Long total;

	public void setResult(List<CreationPlanData> result) {
		this.result = result;
	}
	public List<CreationPlanData> getResult( ) {
		return this.result;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
