package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QueryGroup;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.group.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenPublicGroupBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2834349693757389954L;

	/** 
	 * 用户分组列表，包含每个分组的id、name、以及规则模型
	 */
	@ApiListField("groups")
	@ApiField("query_group")
	private List<QueryGroup> groups;

	public void setGroups(List<QueryGroup> groups) {
		this.groups = groups;
	}
	public List<QueryGroup> getGroups( ) {
		return this.groups;
	}

}
