package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 判断云凤蝶请求的接口成功与否
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:09
 */
public class FengdieSuccessRespModel extends AlipayObject {

	private static final long serialVersionUID = 3694855418533512881L;

	/**
	 * 判断请求操作是否成功，值为 true 或者 false
	 */
	@ApiField("success")
	private Boolean success;

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
