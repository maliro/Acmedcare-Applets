package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 新增广告主
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:41
 */
public class AlipayCommerceTransportAdUserCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8775988193452833339L;

	/**
	 * 广告主用户信息，参见文档
	 */
	@ApiField("ad_user")
	private AdUser adUser;

	public AdUser getAdUser() {
		return this.adUser;
	}
	public void setAdUser(AdUser adUser) {
		this.adUser = adUser;
	}

}
