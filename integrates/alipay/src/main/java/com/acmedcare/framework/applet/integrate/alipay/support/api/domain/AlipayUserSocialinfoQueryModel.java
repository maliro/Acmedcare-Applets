package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 支付宝用户昵称、头像查询接口
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:33:09
 */
public class AlipayUserSocialinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8416895112815979757L;

	/**
	 * 蚂蚁统一会员ID，不可为空，最大一次传递10个
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
