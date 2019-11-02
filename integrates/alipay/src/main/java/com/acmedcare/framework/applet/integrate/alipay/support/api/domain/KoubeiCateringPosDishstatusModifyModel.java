package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 批量起售/停售菜品
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:19:10
 */
public class KoubeiCateringPosDishstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4745189962221559525L;

	/**
	 * 需要改售卖状态的菜品id集合
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	/**
	 * open:起售；stop:停售
	 */
	@ApiField("status")
	private String status;

	public List<String> getDishIds() {
		return this.dishIds;
	}
	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}