package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.Date;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 快消店铺展位内容上下架接口
 *
 * @author auto create
 * @since 1.0, 2017-05-16 17:02:51
 */
public class KoubeiMarketingCampaignRetailDmSetModel extends AlipayObject {

	private static final long serialVersionUID = 7565213883666575699L;

	/**
	 * 下架时间，仅上架操作时使用，必须晚于当前时间
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 内容ID，调用koubei.marketing.campaign.retail.dm.create创建内容时返回的内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 上下架操作类型，上架：ONLINE，下架：OFFLINE，注意：请先调用创建内容接口再进行上架操作，下架内容不得再上架。
	 */
	@ApiField("operate_type")
	private String operateType;

	public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}
	public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}