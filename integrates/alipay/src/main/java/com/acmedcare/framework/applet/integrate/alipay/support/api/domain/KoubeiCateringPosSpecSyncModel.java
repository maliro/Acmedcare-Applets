package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 菜品规格信息
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:26:31
 */
public class KoubeiCateringPosSpecSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4188683373648121869L;

	/**
	 * 菜品规格信息
	 */
	@ApiField("spec")
	private SpecEntity spec;

	/**
	 * 规格ids,删除时传
	 */
	@ApiListField("spec_ids")
	@ApiField("string")
	private List<String> specIds;

	/**
	 * 操作类型 add 新增，update 修改，del 删除 ，其他返回null
	 */
	@ApiField("type")
	private String type;

	public SpecEntity getSpec() {
		return this.spec;
	}
	public void setSpec(SpecEntity spec) {
		this.spec = spec;
	}

	public List<String> getSpecIds() {
		return this.specIds;
	}
	public void setSpecIds(List<String> specIds) {
		this.specIds = specIds;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
