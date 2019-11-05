package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 营销位删除接口
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:22:56
 */
public class AlipayOpenPublicTopicDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2782661963925323939L;

	/**
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

	public String getTopicId() {
		return this.topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}
