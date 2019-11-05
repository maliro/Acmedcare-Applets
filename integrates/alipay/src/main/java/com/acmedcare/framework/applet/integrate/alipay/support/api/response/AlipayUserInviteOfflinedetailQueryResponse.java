package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OfflineInviteNewerDetailInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.offlinedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-15 11:50:01
 */
public class AlipayUserInviteOfflinedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628697689238123847L;

	/** 
	 * 线下拉新结算明细数据列表
	 */
	@ApiListField("offline_detail_info_list")
	@ApiField("offline_invite_newer_detail_info")
	private List<OfflineInviteNewerDetailInfo> offlineDetailInfoList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setOfflineDetailInfoList(List<OfflineInviteNewerDetailInfo> offlineDetailInfoList) {
		this.offlineDetailInfoList = offlineDetailInfoList;
	}
	public List<OfflineInviteNewerDetailInfo> getOfflineDetailInfoList( ) {
		return this.offlineDetailInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
