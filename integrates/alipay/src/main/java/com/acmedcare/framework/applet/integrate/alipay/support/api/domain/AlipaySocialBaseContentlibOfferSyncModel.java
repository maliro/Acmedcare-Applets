package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 内容中台offer同步接口
 *
 * @author auto create
 * @since 1.0, 2019-08-31 14:21:37
 */
public class AlipaySocialBaseContentlibOfferSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3671545356476179545L;

	/**
	 * 参数名代表同步到我方的业务方来源值，在内容中台中是唯一标示，对接内容中台的时候，由中台PD告知对方
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 内容中台offer同步，具体的数据内容，是个列表，支持批量修改传递
	 */
	@ApiField("display_app")
	private OfferObject displayApp;

	/**
	 * 标示本次操作具体的行为
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public OfferObject getDisplayApp() {
		return this.displayApp;
	}
	public void setDisplayApp(OfferObject displayApp) {
		this.displayApp = displayApp;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}