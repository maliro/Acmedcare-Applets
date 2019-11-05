package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 规则创建模型
 *
 * @author auto create
 * @since 1.0, 2018-12-27 14:13:56
 */
public class KoubeiCateringDishRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5251274281343942637L;

	/**
	 * 菜品规则通用模型
	 */
	@ApiField("kb_dish_rule_info")
	private KbdishRuleInfo kbDishRuleInfo;

	public KbdishRuleInfo getKbDishRuleInfo() {
		return this.kbDishRuleInfo;
	}
	public void setKbDishRuleInfo(KbdishRuleInfo kbDishRuleInfo) {
		this.kbDishRuleInfo = kbDishRuleInfo;
	}

}
