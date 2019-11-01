package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ExtitemDetailInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.extitem.shopextitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailExtitemShopextitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8549546122771658716L;

	/** 
	 * 标品详情列表
	 */
	@ApiListField("extitem_detail_list")
	@ApiField("extitem_detail_info")
	private List<ExtitemDetailInfo> extitemDetailList;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setExtitemDetailList(List<ExtitemDetailInfo> extitemDetailList) {
		this.extitemDetailList = extitemDetailList;
	}
	public List<ExtitemDetailInfo> getExtitemDetailList( ) {
		return this.extitemDetailList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
