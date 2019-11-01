package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 芝麻信用企业征信产品推广码下线
 *
 * @author auto create
 * @since 1.0, 2019-01-15 18:55:56
 */
public class ZhimaCreditEpProductCodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8442514368145699843L;

	/**
	 * 二维码唯一标识id
	 */
	@ApiField("code_id")
	private String codeId;

	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

}
