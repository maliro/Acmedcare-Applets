package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 升级数据验证
 *
 * @author auto create
 * @since 1.0, 2019-04-03 13:09:27
 */
public class AlipayOpenAppUpdattestBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3152421964235442494L;

	/**
	 * 64
	 */
	@ApiField("campus_card")
	private String campusCard;

	/**
	 * 21
	 */
	@ApiField("s")
	private String s;

	public String getCampusCard() {
		return this.campusCard;
	}
	public void setCampusCard(String campusCard) {
		this.campusCard = campusCard;
	}

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
