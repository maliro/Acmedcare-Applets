package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 投放账户余额上线
 *
 * @author auto create
 * @since 1.0, 2019-07-30 17:30:21
 */
public class AlipayDataDataserviceAdUserbalanceOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 3643575758435337222L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 投放账户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("number")
	private List<Long> userIdList;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public List<Long> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<Long> userIdList) {
		this.userIdList = userIdList;
	}

}
