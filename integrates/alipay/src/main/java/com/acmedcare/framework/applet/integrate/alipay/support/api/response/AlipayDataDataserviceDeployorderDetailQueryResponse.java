package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DxDeployOrderInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceDeployorderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3847949521419681739L;

	/** 
	 * 部署单列表
	 */
	@ApiListField("deploy_order_list")
	@ApiField("dx_deploy_order_info")
	private List<DxDeployOrderInfo> deployOrderList;

	public void setDeployOrderList(List<DxDeployOrderInfo> deployOrderList) {
		this.deployOrderList = deployOrderList;
	}
	public List<DxDeployOrderInfo> getDeployOrderList( ) {
		return this.deployOrderList;
	}

}
