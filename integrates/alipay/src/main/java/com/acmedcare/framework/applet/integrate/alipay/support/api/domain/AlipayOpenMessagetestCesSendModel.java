package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 测试消息发送文档
 *
 * @author auto create
 * @since 1.0, 2019-03-05 14:17:37
 */
public class AlipayOpenMessagetestCesSendModel extends AlipayObject {

	private static final long serialVersionUID = 7578392429556254772L;

	/**
	 * 测试
	 */
	@ApiListField("cop")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> cop;

	/**
	 * 21
	 */
	@ApiListField("str")
	@ApiField("string")
	private List<String> str;

	public List<GavintestNewLeveaOne> getCop() {
		return this.cop;
	}
	public void setCop(List<GavintestNewLeveaOne> cop) {
		this.cop = cop;
	}

	public List<String> getStr() {
		return this.str;
	}
	public void setStr(List<String> str) {
		this.str = str;
	}

}
