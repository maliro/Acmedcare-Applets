package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询token上下文
 *
 * @author auto create
 * @since 1.0, 2019-06-17 16:18:57
 */
public class AlipayCommerceKidsAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5516866859494859787L;

	/**
	 * 登陆名
	 */
	@ApiField("login_name")
	private String loginName;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getLoginName() {
		return this.loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
