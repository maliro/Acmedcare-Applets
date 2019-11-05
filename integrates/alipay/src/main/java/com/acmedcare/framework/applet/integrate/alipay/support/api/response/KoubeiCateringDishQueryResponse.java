package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbdishInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-05 17:45:01
 */
public class KoubeiCateringDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5598255978184436663L;

	/** 
	 * 口碑菜品模型列表
	 */
	@ApiListField("kb_dish_info_list")
	@ApiField("kbdish_info")
	private List<KbdishInfo> kbDishInfoList;

	public void setKbDishInfoList(List<KbdishInfo> kbDishInfoList) {
		this.kbDishInfoList = kbDishInfoList;
	}
	public List<KbdishInfo> getKbDishInfoList( ) {
		return this.kbDishInfoList;
	}

}
