package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * alipay.open.public.tmall.follow.create(品牌号关注关系同步)
 *
 * @author auto create
 * @since 1.0, 2019-08-22 20:12:17
 */
public class AlipayOpenPublicFollowCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6271734497692165177L;

	/**
	 * 来源，目前只有"tmall"
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
