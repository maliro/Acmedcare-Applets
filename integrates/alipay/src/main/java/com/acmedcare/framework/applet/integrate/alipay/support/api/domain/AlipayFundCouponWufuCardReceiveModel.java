package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 新春五福福卡领取接口
 *
 * @author auto create
 * @since 1.0, 2018-12-28 19:48:58
 */
public class AlipayFundCouponWufuCardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1638698842887595256L;

	/**
	 * 业务流水号，用于数据关联核对，不做为幂等使用。
	 */
	@ApiField("front_biz_no")
	private String frontBizNo;

	/**
	 * 福卡领取场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getFrontBizNo() {
		return this.frontBizNo;
	}
	public void setFrontBizNo(String frontBizNo) {
		this.frontBizNo = frontBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
