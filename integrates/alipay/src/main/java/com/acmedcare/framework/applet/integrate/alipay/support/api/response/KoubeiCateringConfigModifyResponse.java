package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ShopOrderModifyResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.config.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-18 15:25:00
 */
public class KoubeiCateringConfigModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7176249458978445667L;

	/** 
	 * 每一个店铺修改的结果
	 */
	@ApiListField("config_result_list")
	@ApiField("shop_order_modify_result")
	private List<ShopOrderModifyResult> configResultList;

	public void setConfigResultList(List<ShopOrderModifyResult> configResultList) {
		this.configResultList = configResultList;
	}
	public List<ShopOrderModifyResult> getConfigResultList( ) {
		return this.configResultList;
	}

}
