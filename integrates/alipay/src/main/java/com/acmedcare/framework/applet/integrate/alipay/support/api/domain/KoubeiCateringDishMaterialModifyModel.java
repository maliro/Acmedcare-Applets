package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料修改接口
 *
 * @author auto create
 * @since 1.0, 2018-11-16 20:19:38
 */
public class KoubeiCateringDishMaterialModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5554637792324955668L;

	/**
	 * 菜品加料入参
	 */
	@ApiField("kb_dish_material_info")
	private KbdishMaterialInfo kbDishMaterialInfo;

	public KbdishMaterialInfo getKbDishMaterialInfo() {
		return this.kbDishMaterialInfo;
	}
	public void setKbDishMaterialInfo(KbdishMaterialInfo kbDishMaterialInfo) {
		this.kbDishMaterialInfo = kbDishMaterialInfo;
	}

}
