package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AdMaterialInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.material.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:12:36
 */
public class AlipayCommerceIotAdvertiserMaterialBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876786225898947459L;

	/** 
	 * 物料列表
	 */
	@ApiListField("material_infos")
	@ApiField("ad_material_info")
	private List<AdMaterialInfo> materialInfos;

	/** 
	 * 总大小
	 */
	@ApiField("total")
	private Long total;

	public void setMaterialInfos(List<AdMaterialInfo> materialInfos) {
		this.materialInfos = materialInfos;
	}
	public List<AdMaterialInfo> getMaterialInfos( ) {
		return this.materialInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
