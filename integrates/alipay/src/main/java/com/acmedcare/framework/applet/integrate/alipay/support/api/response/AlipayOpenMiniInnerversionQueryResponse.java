package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MiniAppVersionBaseInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-03 19:43:48
 */
public class AlipayOpenMiniInnerversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8237312399536434541L;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 版本列表
	 */
	@ApiListField("version_list")
	@ApiField("mini_app_version_base_info")
	private List<MiniAppVersionBaseInfo> versionList;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setVersionList(List<MiniAppVersionBaseInfo> versionList) {
		this.versionList = versionList;
	}
	public List<MiniAppVersionBaseInfo> getVersionList( ) {
		return this.versionList;
	}

}
