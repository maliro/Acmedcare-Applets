package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.userbalance.online response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 21:40:04
 */
public class AlipayDataDataserviceAdUserbalanceOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 6543133768881444349L;

	/** 
	 * 操作成功投放账户id列表
	 */
	@ApiListField("success_user_id_list")
	@ApiField("number")
	private List<Long> successUserIdList;

	public void setSuccessUserIdList(List<Long> successUserIdList) {
		this.successUserIdList = successUserIdList;
	}
	public List<Long> getSuccessUserIdList( ) {
		return this.successUserIdList;
	}

}
