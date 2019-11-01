package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.group.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-30 21:45:01
 */
public class AlipayDataDataserviceAdGroupCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6847753869697721598L;

	/** 
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/** 
	 * 外部单元编号
	 */
	@ApiField("group_outer_id")
	private String groupOuterId;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

	public void setGroupOuterId(String groupOuterId) {
		this.groupOuterId = groupOuterId;
	}
	public String getGroupOuterId( ) {
		return this.groupOuterId;
	}

}
