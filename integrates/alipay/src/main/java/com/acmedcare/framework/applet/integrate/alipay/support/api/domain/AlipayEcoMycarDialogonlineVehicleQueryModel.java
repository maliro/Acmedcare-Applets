package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 获取用户车辆信息
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:20:31
 */
public class AlipayEcoMycarDialogonlineVehicleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2674623684227813929L;

	/**
	 * 车辆ID
	 */
	@ApiField("vi_id")
	private String viId;

	public String getViId() {
		return this.viId;
	}
	public void setViId(String viId) {
		this.viId = viId;
	}

}
