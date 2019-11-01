package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.dynamicinfo.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileDeviceinfoDynamicinfoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6114587351978455968L;

	/** 
	 * 同步处理结果
	 */
	@ApiField("operateresult")
	private Boolean operateresult;

	public void setOperateresult(Boolean operateresult) {
		this.operateresult = operateresult;
	}
	public Boolean getOperateresult( ) {
		return this.operateresult;
	}

}
