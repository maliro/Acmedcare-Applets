package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsApplicationQuery;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:08
 */
public class AlipayInsSceneApplicationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4454286232733695771L;

	/** 
	 * 投保单列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application_query")
	private List<InsApplicationQuery> applications;

	public void setApplications(List<InsApplicationQuery> applications) {
		this.applications = applications;
	}
	public List<InsApplicationQuery> getApplications( ) {
		return this.applications;
	}

}
