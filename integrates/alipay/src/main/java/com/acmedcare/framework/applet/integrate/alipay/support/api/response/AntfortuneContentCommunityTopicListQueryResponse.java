package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TopicItemVo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.topic.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntfortuneContentCommunityTopicListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4572936554234532163L;

	/** 
	 * 话题VO列表
	 */
	@ApiListField("topic_list")
	@ApiField("topic_item_vo")
	private List<TopicItemVo> topicList;

	public void setTopicList(List<TopicItemVo> topicList) {
		this.topicList = topicList;
	}
	public List<TopicItemVo> getTopicList( ) {
		return this.topicList;
	}

}
