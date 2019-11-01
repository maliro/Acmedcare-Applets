package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InventoryRecord;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inventoryrecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsInventoryrecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6366142851369369948L;

	/** 
	 * 库存变更记录
	 */
	@ApiListField("inventory_record_list")
	@ApiField("inventory_record")
	private List<InventoryRecord> inventoryRecordList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 页码大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setInventoryRecordList(List<InventoryRecord> inventoryRecordList) {
		this.inventoryRecordList = inventoryRecordList;
	}
	public List<InventoryRecord> getInventoryRecordList( ) {
		return this.inventoryRecordList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
