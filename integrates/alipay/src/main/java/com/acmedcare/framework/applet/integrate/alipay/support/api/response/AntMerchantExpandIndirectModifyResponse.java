package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 11:10:01
 */
public class AntMerchantExpandIndirectModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3196793675728117515L;

	/** 
	 * 可用服务，列表返回</br>
PC：网站支付</br>
APP：无线支付</br>
F2F：当面付</br>
返回为空为不支持所有服务
	 */
	@ApiListField("service_codes")
	@ApiField("string")
	private List<String> serviceCodes;

	/** 
	 * 申请业务失败原因
	 */
	@ApiField("service_fail_reason")
	private String serviceFailReason;

	/** 
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setServiceCodes(List<String> serviceCodes) {
		this.serviceCodes = serviceCodes;
	}
	public List<String> getServiceCodes( ) {
		return this.serviceCodes;
	}

	public void setServiceFailReason(String serviceFailReason) {
		this.serviceFailReason = serviceFailReason;
	}
	public String getServiceFailReason( ) {
		return this.serviceFailReason;
	}

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
