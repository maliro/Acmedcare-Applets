package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 同步组合菜
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:21:32
 */
public class KoubeiCateringPosDishgroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4156713845696198213L;

	/**
	 * 组合菜详情
	 */
	@ApiField("pos_dish_group_model")
	private PosDishGroupModel posDishGroupModel;

	public PosDishGroupModel getPosDishGroupModel() {
		return this.posDishGroupModel;
	}
	public void setPosDishGroupModel(PosDishGroupModel posDishGroupModel) {
		this.posDishGroupModel = posDishGroupModel;
	}

}
