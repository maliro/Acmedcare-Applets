package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 同步评论接口
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:53:46
 */
public class AlipayEcoMycarDataserviceMaintainvehicleShareModel extends AlipayObject {

	private static final long serialVersionUID = 8319941141344665188L;

	/**
	 * 车辆ID
	 */
	@ApiField("vid")
	private String vid;

	public String getVid() {
		return this.vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}

}
