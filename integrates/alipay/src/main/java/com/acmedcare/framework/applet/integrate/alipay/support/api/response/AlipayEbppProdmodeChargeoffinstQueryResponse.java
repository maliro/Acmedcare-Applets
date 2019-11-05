package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.BizListDataInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.chargeoffinst.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppProdmodeChargeoffinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7716431539549624366L;

	/** 
	 * 销账机构下拉列表
	 */
	@ApiListField("data_list")
	@ApiField("biz_list_data_info")
	private List<BizListDataInfo> dataList;

	public void setDataList(List<BizListDataInfo> dataList) {
		this.dataList = dataList;
	}
	public List<BizListDataInfo> getDataList( ) {
		return this.dataList;
	}

}
