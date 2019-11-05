package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶空间成员返回值模型
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:57:57
 */
public class FengdieSpaceMemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2275391982175288358L;

	/**
	 * 用户的昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 云凤蝶业务空间成员所关联的第三方用户 ID
	 */
	@ApiField("origin_user_id")
	private String originUserId;

	public String getNick() {
		return this.nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getOriginUserId() {
		return this.originUserId;
	}
	public void setOriginUserId(String originUserId) {
		this.originUserId = originUserId;
	}

}
