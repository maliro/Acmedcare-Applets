package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * icrowd通用接口服务
 *
 * @author auto create
 * @since 1.0, 2018-10-25 11:00:24
 */
public class AlipayDataDataserviceIcrowdUseModel extends AlipayObject {

	private static final long serialVersionUID = 6775668944767744861L;

	/**
	 * icrowd接口请求参数＋唯一不可空
	 */
	@ApiField("icrowd_use_param")
	private IcrowdUseParam icrowdUseParam;

	public IcrowdUseParam getIcrowdUseParam() {
		return this.icrowdUseParam;
	}
	public void setIcrowdUseParam(IcrowdUseParam icrowdUseParam) {
		this.icrowdUseParam = icrowdUseParam;
	}

}
