package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序修改POI展示状态
 *
 * @author auto create
 * @since 1.0, 2018-12-29 16:33:30
 */
public class AlipayOpenMiniPoiShowstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5478778242343435373L;

	/**
	 * poi id，地理位置标记信息
	 */
	@ApiField("poi_id")
	private String poiId;

	/**
	 * 是否展示 0 不展示 1展示
	 */
	@ApiField("show_status")
	private String showStatus;

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

	public String getShowStatus() {
		return this.showStatus;
	}
	public void setShowStatus(String showStatus) {
		this.showStatus = showStatus;
	}

}
