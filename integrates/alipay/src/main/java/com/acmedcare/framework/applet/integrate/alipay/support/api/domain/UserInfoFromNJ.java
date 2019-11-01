package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2019-04-19 15:09:42
 */
public class UserInfoFromNJ extends AlipayObject {

	private static final long serialVersionUID = 7838679111418678638L;

	/**
	 * 姓名
	 */
	@ApiField("company")
	private String company;

	/**
	 * 电话
	 */
	@ApiField("tel")
	private String tel;

	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
