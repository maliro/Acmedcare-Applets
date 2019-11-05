package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 文档发布验证
 *
 * @author auto create
 * @since 1.0, 2019-06-16 11:46:55
 */
public class AlipayOpenPublicComptestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8546271143689274299L;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 测试
	 */
	@ApiListField("string")
	@ApiField("gavintest_new_levea_one")
	private List<GavintestNewLeveaOne> string;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<GavintestNewLeveaOne> getString() {
		return this.string;
	}
	public void setString(List<GavintestNewLeveaOne> string) {
		this.string = string;
	}

}
