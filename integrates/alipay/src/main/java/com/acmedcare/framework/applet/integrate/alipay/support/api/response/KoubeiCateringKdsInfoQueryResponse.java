package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KdsInfoModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kds.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-05 15:48:56
 */
public class KoubeiCateringKdsInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5537771596554296169L;

	/** 
	 * kds 配置信息列表
	 */
	@ApiListField("kds_info_model_list")
	@ApiField("kds_info_model")
	private List<KdsInfoModel> kdsInfoModelList;

	public void setKdsInfoModelList(List<KdsInfoModel> kdsInfoModelList) {
		this.kdsInfoModelList = kdsInfoModelList;
	}
	public List<KdsInfoModel> getKdsInfoModelList( ) {
		return this.kdsInfoModelList;
	}

}
