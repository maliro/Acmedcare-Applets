package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 为服务窗合作伙伴（如YunOS），提供操作服务窗菜单的功能
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:54:00
 */
public class AlipayOpenPublicPartnerMenuOperateModel extends AlipayObject {

	private static final long serialVersionUID = 1763273546347953876L;

	/**
	 * 行为参数
	 */
	@ApiField("action_param")
	private String actionParam;

	/**
	 * 行为类型(in，out，api)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 服务窗id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 第三方账号ID ,银行卡号/户号/手机号
	 */
	@ApiField("third_account_id")
	private String thirdAccountId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActionParam() {
		return this.actionParam;
	}
	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getThirdAccountId() {
		return this.thirdAccountId;
	}
	public void setThirdAccountId(String thirdAccountId) {
		this.thirdAccountId = thirdAccountId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
