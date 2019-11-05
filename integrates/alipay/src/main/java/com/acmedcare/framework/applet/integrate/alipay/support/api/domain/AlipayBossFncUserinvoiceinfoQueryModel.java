package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 根据PID获取相关的开票资料
 *
 * @author auto create
 * @since 1.0, 2018-11-27 21:31:19
 */
public class AlipayBossFncUserinvoiceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5489754754544935672L;

	/**
	 * 开票pid/mid/ou，唯一标识商户信息/集团用户信息的ID
	 */
	@ApiField("pid")
	private String pid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
