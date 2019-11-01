package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 采购单发货通知接口
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:42:57
 */
public class KoubeiSalesKbassetStuffPurordersendSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2318876536568634985L;

	/**
	 * 供应商同步的发货信息及物流信息记录（最多100条）
	 */
	@ApiListField("purchase_order_sends")
	@ApiField("access_purchase_order_send")
	private List<AccessPurchaseOrderSend> purchaseOrderSends;

	public List<AccessPurchaseOrderSend> getPurchaseOrderSends() {
		return this.purchaseOrderSends;
	}
	public void setPurchaseOrderSends(List<AccessPurchaseOrderSend> purchaseOrderSends) {
		this.purchaseOrderSends = purchaseOrderSends;
	}

}
