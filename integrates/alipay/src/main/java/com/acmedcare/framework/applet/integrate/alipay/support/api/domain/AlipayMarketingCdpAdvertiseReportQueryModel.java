package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 广告效果分析接口
 *
 * @author auto create
 * @since 1.0, 2017-08-18 15:36:32
 */
public class AlipayMarketingCdpAdvertiseReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2339184666811864283L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

}
