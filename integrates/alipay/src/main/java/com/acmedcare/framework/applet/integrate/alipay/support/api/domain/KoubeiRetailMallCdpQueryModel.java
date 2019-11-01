package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商圈开放页面投放内容查询
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:17
 */
public class KoubeiRetailMallCdpQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7519893751417471882L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
