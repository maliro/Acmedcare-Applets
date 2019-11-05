package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertChannelResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionChannelModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1485429339173737216L;

	/** 
	 * 渠道修改接口
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
