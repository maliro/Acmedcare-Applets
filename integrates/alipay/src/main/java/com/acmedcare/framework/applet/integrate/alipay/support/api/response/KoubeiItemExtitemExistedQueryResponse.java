package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.existed.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiItemExtitemExistedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1426137745676489218L;

	/** 
	 * 商品库中存在的商品编码
	 */
	@ApiListField("existed_list")
	@ApiField("string")
	private List<String> existedList;

	public void setExistedList(List<String> existedList) {
		this.existedList = existedList;
	}
	public List<String> getExistedList( ) {
		return this.existedList;
	}

}
