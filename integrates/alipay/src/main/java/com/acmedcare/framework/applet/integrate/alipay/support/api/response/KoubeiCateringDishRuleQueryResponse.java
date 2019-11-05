package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbdishRuleInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-08 15:40:01
 */
public class KoubeiCateringDishRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3795788647925368792L;

	/** 
	 * 规则的返回集合
	 */
	@ApiListField("kb_dish_rule_info_list")
	@ApiField("kbdish_rule_info")
	private List<KbdishRuleInfo> kbDishRuleInfoList;

	public void setKbDishRuleInfoList(List<KbdishRuleInfo> kbDishRuleInfoList) {
		this.kbDishRuleInfoList = kbDishRuleInfoList;
	}
	public List<KbdishRuleInfo> getKbDishRuleInfoList( ) {
		return this.kbDishRuleInfoList;
	}

}
