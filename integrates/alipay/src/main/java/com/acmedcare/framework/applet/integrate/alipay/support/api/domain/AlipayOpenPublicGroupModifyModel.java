package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 用户分组修改接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:46:16
 */
public class AlipayOpenPublicGroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8747937634497227139L;

	/**
	 * 分组ID，整型值
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 标签规则，满足该规则的粉丝将被圈定，标签id不能重复
	 */
	@ApiListField("label_rule")
	@ApiField("complex_label_rule")
	private List<ComplexLabelRule> labelRule;

	/**
	 * 分组名称，仅支持中文、字母、数字、下划线的组合。
	 */
	@ApiField("name")
	private String name;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<ComplexLabelRule> getLabelRule() {
		return this.labelRule;
	}
	public void setLabelRule(List<ComplexLabelRule> labelRule) {
		this.labelRule = labelRule;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
