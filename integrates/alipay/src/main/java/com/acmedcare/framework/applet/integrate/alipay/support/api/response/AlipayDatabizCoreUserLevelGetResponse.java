package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AlipayUserLevelInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.user.level.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-14 15:25:03
 */
public class AlipayDatabizCoreUserLevelGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5689312625333455575L;

	/** 
	 * 支付宝用户等级信息
	 */
	@ApiListField("user_level_infos")
	@ApiField("alipay_user_level_info")
	private List<AlipayUserLevelInfo> userLevelInfos;

	public void setUserLevelInfos(List<AlipayUserLevelInfo> userLevelInfos) {
		this.userLevelInfos = userLevelInfos;
	}
	public List<AlipayUserLevelInfo> getUserLevelInfos( ) {
		return this.userLevelInfos;
	}

}
