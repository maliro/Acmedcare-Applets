package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CaterItemListInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.itemlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-09 22:38:41
 */
public class KoubeiCateringItemlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2452192454361789296L;

	/** 
	 * 商品摘要信息列表
	 */
	@ApiListField("item_list")
	@ApiField("cater_item_list_info")
	private List<CaterItemListInfo> itemList;

	/** 
	 * 请求id。支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 当前可查询商品总条目数
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public void setItemList(List<CaterItemListInfo> itemList) {
		this.itemList = itemList;
	}
	public List<CaterItemListInfo> getItemList( ) {
		return this.itemList;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getTotalAmount( ) {
		return this.totalAmount;
	}

}
