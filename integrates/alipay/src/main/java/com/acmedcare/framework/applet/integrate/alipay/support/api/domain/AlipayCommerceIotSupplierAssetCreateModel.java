package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 供应商设备信息创建
 *
 * @author auto create
 * @since 1.0, 2019-08-21 19:51:42
 */
public class AlipayCommerceIotSupplierAssetCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8147737434741614631L;

	/**
	 * 供应商设备信息
	 */
	@ApiField("record")
	private SupplierAssetResponse record;

	public SupplierAssetResponse getRecord() {
		return this.record;
	}
	public void setRecord(SupplierAssetResponse record) {
		this.record = record;
	}

}
