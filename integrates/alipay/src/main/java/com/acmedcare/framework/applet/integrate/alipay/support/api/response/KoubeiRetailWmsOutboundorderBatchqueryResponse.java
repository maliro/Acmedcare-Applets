package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OutboundOrderVO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsOutboundorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5289444571867959919L;

	/** 
	 * 出库通知单列表
	 */
	@ApiListField("outbound_order_vo_list")
	@ApiField("outbound_order_v_o")
	private List<OutboundOrderVO> outboundOrderVoList;

	public void setOutboundOrderVoList(List<OutboundOrderVO> outboundOrderVoList) {
		this.outboundOrderVoList = outboundOrderVoList;
	}
	public List<OutboundOrderVO> getOutboundOrderVoList( ) {
		return this.outboundOrderVoList;
	}

}
