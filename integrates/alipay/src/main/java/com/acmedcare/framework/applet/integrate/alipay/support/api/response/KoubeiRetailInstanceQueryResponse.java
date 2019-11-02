package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InstanceInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6572635772168736284L;

	/** 
	 * 商户维度券或者DM信息列表
	 */
	@ApiListField("instance_list")
	@ApiField("instance_info")
	private List<InstanceInfo> instanceList;

	/** 
	 * 返回的总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setInstanceList(List<InstanceInfo> instanceList) {
		this.instanceList = instanceList;
	}
	public List<InstanceInfo> getInstanceList( ) {
		return this.instanceList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}