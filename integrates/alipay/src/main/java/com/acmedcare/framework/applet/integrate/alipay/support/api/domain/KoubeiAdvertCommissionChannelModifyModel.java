package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 口碑客渠道管理接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:56
 */
public class KoubeiAdvertCommissionChannelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6297917673483131787L;

	/**
	 * 修改渠道信息(新增、删除、修改渠道不可同时为空)
	 */
	@ApiListField("channels")
	@ApiField("kb_advert_modify_channel_request")
	private List<KbAdvertModifyChannelRequest> channels;

	public List<KbAdvertModifyChannelRequest> getChannels() {
		return this.channels;
	}
	public void setChannels(List<KbAdvertModifyChannelRequest> channels) {
		this.channels = channels;
	}

}
