package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AppBasicInfoResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.appinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 17:35:01
 */
public class AlipayOpenMiniAppinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4751816717931872993L;

	/** 
	 * 应用信息列表
	 */
	@ApiListField("app_basic_info_response_list")
	@ApiField("app_basic_info_response")
	private List<AppBasicInfoResponse> appBasicInfoResponseList;

	public void setAppBasicInfoResponseList(List<AppBasicInfoResponse> appBasicInfoResponseList) {
		this.appBasicInfoResponseList = appBasicInfoResponseList;
	}
	public List<AppBasicInfoResponse> getAppBasicInfoResponseList( ) {
		return this.appBasicInfoResponseList;
	}

}
