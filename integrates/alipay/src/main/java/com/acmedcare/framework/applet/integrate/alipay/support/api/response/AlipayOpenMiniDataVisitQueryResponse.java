package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AreaDetail;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.data.visit.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-20 18:19:35
 */
public class AlipayOpenMiniDataVisitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1318575263736989312L;

	/** 
	 * 小程序当日pv
	 */
	@ApiField("app_pv")
	private Long appPv;

	/** 
	 * 小程序当日uv
	 */
	@ApiField("app_uv")
	private Long appUv;

	/** 
	 * 小程序的区域pv、uv等数据列表
	 */
	@ApiListField("area_detail_list")
	@ApiField("area_detail")
	private List<AreaDetail> areaDetailList;

	public void setAppPv(Long appPv) {
		this.appPv = appPv;
	}
	public Long getAppPv( ) {
		return this.appPv;
	}

	public void setAppUv(Long appUv) {
		this.appUv = appUv;
	}
	public Long getAppUv( ) {
		return this.appUv;
	}

	public void setAreaDetailList(List<AreaDetail> areaDetailList) {
		this.areaDetailList = areaDetailList;
	}
	public List<AreaDetail> getAreaDetailList( ) {
		return this.areaDetailList;
	}

}
