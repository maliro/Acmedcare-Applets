package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 查询作品集信息
 *
 * @author auto create
 * @since 1.0, 2017-12-28 13:57:13
 */
public class KoubeiServindustryPortfolioShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7735189263567916136L;

	/**
	 * 插件id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 当前页码；页码必须大于等于1；最大值：100
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小;默认值：20；最大值：100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
