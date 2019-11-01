package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 支付宝社交查询加入的群列表
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:15:36
 */
public class AlipaySocialBaseChatGroupsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5774736917472142644L;

	/**
	 * 上次接口返回的key，初始传0
	 */
	@ApiField("last_key")
	private Long lastKey;

	public Long getLastKey() {
		return this.lastKey;
	}
	public void setLastKey(Long lastKey) {
		this.lastKey = lastKey;
	}

}
