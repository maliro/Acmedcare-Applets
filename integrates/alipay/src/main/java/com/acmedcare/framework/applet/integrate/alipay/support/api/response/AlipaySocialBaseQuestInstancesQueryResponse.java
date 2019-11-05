package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.QuestInstanceDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instances.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-19 15:05:01
 */
public class AlipaySocialBaseQuestInstancesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5265422842873435217L;

	/** 
	 * 用户实例的查询结果集
	 */
	@ApiListField("instances")
	@ApiField("quest_instance_d_t_o")
	private List<QuestInstanceDTO> instances;

	public void setInstances(List<QuestInstanceDTO> instances) {
		this.instances = instances;
	}
	public List<QuestInstanceDTO> getInstances( ) {
		return this.instances;
	}

}
