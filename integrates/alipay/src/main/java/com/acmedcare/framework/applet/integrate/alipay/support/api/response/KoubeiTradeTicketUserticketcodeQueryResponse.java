package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TicketCodeQueryResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.userticketcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-31 22:38:57
 */
public class KoubeiTradeTicketUserticketcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1424272456656482848L;

	/** 
	 * 查询结果列表
	 */
	@ApiListField("values")
	@ApiField("ticket_code_query_response")
	private List<TicketCodeQueryResponse> values;

	public void setValues(List<TicketCodeQueryResponse> values) {
		this.values = values;
	}
	public List<TicketCodeQueryResponse> getValues( ) {
		return this.values;
	}

}
