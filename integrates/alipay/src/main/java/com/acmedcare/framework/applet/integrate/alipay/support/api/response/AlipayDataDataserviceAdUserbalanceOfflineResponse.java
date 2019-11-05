package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.userbalance.offline response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 21:30:01
 */
public class AlipayDataDataserviceAdUserbalanceOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 6134389229824488754L;

	/** 
	 * 操作成功投放账户id列表
	 */
	@ApiListField("success_user_id_list")
	@ApiField("string")
	private List<String> successUserIdList;

	public void setSuccessUserIdList(List<String> successUserIdList) {
		this.successUserIdList = successUserIdList;
	}
	public List<String> getSuccessUserIdList( ) {
		return this.successUserIdList;
	}

}
