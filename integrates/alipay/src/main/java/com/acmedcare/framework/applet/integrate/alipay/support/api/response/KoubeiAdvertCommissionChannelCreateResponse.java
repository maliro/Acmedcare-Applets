package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertChannelResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionChannelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8495395947653925546L;

	/** 
	 * 新增渠道接口，需要记录渠道ID
	 */
	@ApiListField("channel_response")
	@ApiField("kb_advert_channel_response")
	private List<KbAdvertChannelResponse> channelResponse;

	public void setChannelResponse(List<KbAdvertChannelResponse> channelResponse) {
		this.channelResponse = channelResponse;
	}
	public List<KbAdvertChannelResponse> getChannelResponse( ) {
		return this.channelResponse;
	}

}
