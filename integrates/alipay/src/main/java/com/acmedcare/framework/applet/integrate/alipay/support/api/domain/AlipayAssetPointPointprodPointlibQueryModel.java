package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 集分宝积分库查询
 *
 * @author auto create
 * @since 1.0, 2019-08-29 17:45:49
 */
public class AlipayAssetPointPointprodPointlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8713772325778536969L;

	/**
	 * 集分宝积分库ID
	 */
	@ApiField("point_lib_id")
	private String pointLibId;

	public String getPointLibId() {
		return this.pointLibId;
	}
	public void setPointLibId(String pointLibId) {
		this.pointLibId = pointLibId;
	}

}
