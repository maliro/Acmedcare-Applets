package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbAdvertIdentifyResponse;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.advert.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionAdvertPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7522361135111724293L;

	/** 
	 * 主键Code结果，采购请求是批量形式的，每个identify，对应一个处理结果
	 */
	@ApiListField("identify_codes")
	@ApiField("kb_advert_identify_response")
	private List<KbAdvertIdentifyResponse> identifyCodes;

	public void setIdentifyCodes(List<KbAdvertIdentifyResponse> identifyCodes) {
		this.identifyCodes = identifyCodes;
	}
	public List<KbAdvertIdentifyResponse> getIdentifyCodes( ) {
		return this.identifyCodes;
	}

}
