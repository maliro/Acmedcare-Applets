package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 开台菜默认规则类型
 *
 * @author auto create
 * @since 1.0, 2018-12-27 19:37:29
 */
public class DefaultInCartInfo extends AlipayObject {

	private static final long serialVersionUID = 4444811798869728954L;

	/**
	 * 如果不设置就餐人数，该字段必填，代表开台菜的默认必点数量。
	 */
	@ApiField("default_num")
	private Long defaultNum;

	/**
	 * true/false。表示该条开台菜必点数量是否关联就餐人数。
	 */
	@ApiField("link_guest")
	private Boolean linkGuest;

	/**
	 * 如果关联就餐人数，该项必填，代表每个人开台菜的必点数量。
	 */
	@ApiField("per_num")
	private Long perNum;

	public Long getDefaultNum() {
		return this.defaultNum;
	}
	public void setDefaultNum(Long defaultNum) {
		this.defaultNum = defaultNum;
	}

	public Boolean getLinkGuest() {
		return this.linkGuest;
	}
	public void setLinkGuest(Boolean linkGuest) {
		this.linkGuest = linkGuest;
	}

	public Long getPerNum() {
		return this.perNum;
	}
	public void setPerNum(Long perNum) {
		this.perNum = perNum;
	}

}
