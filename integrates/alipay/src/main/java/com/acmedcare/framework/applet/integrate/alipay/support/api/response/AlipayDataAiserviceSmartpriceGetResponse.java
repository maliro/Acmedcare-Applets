package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.HelloBikePriceResultItem;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.smartprice.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-18 21:10:00
 */
public class AlipayDataAiserviceSmartpriceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4839129863392615614L;

	/** 
	 * 兼容V1.0。用户购买hellobike月卡的推荐价格，单位为分。
	 */
	@ApiField("promo_price_cent")
	private Long promoPriceCent;

	/** 
	 * 返回结果列表
	 */
	@ApiListField("result")
	@ApiField("hello_bike_price_result_item")
	private List<HelloBikePriceResultItem> result;

	public void setPromoPriceCent(Long promoPriceCent) {
		this.promoPriceCent = promoPriceCent;
	}
	public Long getPromoPriceCent( ) {
		return this.promoPriceCent;
	}

	public void setResult(List<HelloBikePriceResultItem> result) {
		this.result = result;
	}
	public List<HelloBikePriceResultItem> getResult( ) {
		return this.result;
	}

}
