package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑菜品项目组查询
 *
 * @author auto create
 * @since 1.0, 2019-03-05 19:18:54
 */
public class KoubeiCateringDishGroupQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5176353423236869446L;

	/**
	 * 项目组id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
