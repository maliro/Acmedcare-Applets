package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OnlineInviteNewerSummaryInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.onlinesummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-21 14:37:41
 */
public class AlipayUserInviteOnlinesummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8728837439193957295L;

	/** 
	 * 线上拉新结算汇总数据列表
	 */
	@ApiListField("online_summary_info_list")
	@ApiField("online_invite_newer_summary_info")
	private List<OnlineInviteNewerSummaryInfo> onlineSummaryInfoList;

	public void setOnlineSummaryInfoList(List<OnlineInviteNewerSummaryInfo> onlineSummaryInfoList) {
		this.onlineSummaryInfoList = onlineSummaryInfoList;
	}
	public List<OnlineInviteNewerSummaryInfo> getOnlineSummaryInfoList( ) {
		return this.onlineSummaryInfoList;
	}

}
