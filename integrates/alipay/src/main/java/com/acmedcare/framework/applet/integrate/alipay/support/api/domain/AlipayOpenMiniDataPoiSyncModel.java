package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 小程序poi数据同步
 *
 * @author auto create
 * @since 1.0, 2019-07-29 16:33:16
 */
public class AlipayOpenMiniDataPoiSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4881741495418645295L;

	/**
	 * poi回流数据
	 */
	@ApiField("poi_data")
	private PoiSyncData poiData;

	public PoiSyncData getPoiData() {
		return this.poiData;
	}
	public void setPoiData(PoiSyncData poiData) {
		this.poiData = poiData;
	}

}
