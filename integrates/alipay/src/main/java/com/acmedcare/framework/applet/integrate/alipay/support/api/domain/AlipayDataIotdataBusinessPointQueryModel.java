package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 业务点位查询
 *
 * @author auto create
 * @since 1.0, 2019-07-31 14:12:11
 */
public class AlipayDataIotdataBusinessPointQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8289751732152794919L;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private Long businessId;

	public Long getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

}
