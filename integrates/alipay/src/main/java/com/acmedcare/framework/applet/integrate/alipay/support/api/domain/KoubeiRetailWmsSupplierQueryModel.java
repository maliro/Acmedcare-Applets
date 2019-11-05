package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 口碑零售供应商信息查询
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:17:15
 */
public class KoubeiRetailWmsSupplierQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6823231388195314399L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 供应商ID，限制批量查询100个ID
	 */
	@ApiListField("supplier_ids")
	@ApiField("string")
	private List<String> supplierIds;

	public OperateContext getOperateContext() {
		return this.operateContext;
	}
	public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

	public List<String> getSupplierIds() {
		return this.supplierIds;
	}
	public void setSupplierIds(List<String> supplierIds) {
		this.supplierIds = supplierIds;
	}

}
