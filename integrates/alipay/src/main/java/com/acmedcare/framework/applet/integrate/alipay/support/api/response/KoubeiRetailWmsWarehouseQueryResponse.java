package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.WarehouseVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.warehouse.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsWarehouseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3887468992415757884L;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 仓库信息
	 */
	@ApiListField("warehouses")
	@ApiField("warehouse_v_o")
	private List<WarehouseVO> warehouses;

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setWarehouses(List<WarehouseVO> warehouses) {
		this.warehouses = warehouses;
	}
	public List<WarehouseVO> getWarehouses( ) {
		return this.warehouses;
	}

}
