package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询芝麻信用等级
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:48:31
 */
public class AlipayEcoRenthouseRenterZhimaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5849163313124179238L;

	/**
	 * 身份证号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
