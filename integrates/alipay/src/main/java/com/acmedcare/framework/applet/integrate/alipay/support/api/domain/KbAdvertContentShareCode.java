package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑广告系统吱口令内容详情
 *
 * @author auto create
 * @since 1.0, 2017-02-15 13:57:59
 */
public class KbAdvertContentShareCode extends AlipayObject {

	private static final long serialVersionUID = 1536324934448648515L;

	/**
	 * 吱口令内容详情
	 */
	@ApiField("share_code_desc")
	private String shareCodeDesc;

	public String getShareCodeDesc() {
		return this.shareCodeDesc;
	}
	public void setShareCodeDesc(String shareCodeDesc) {
		this.shareCodeDesc = shareCodeDesc;
	}

}
