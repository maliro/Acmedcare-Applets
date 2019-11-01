package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 申请支付宝S码
 *
 * @author auto create
 * @since 1.0, 2019-09-19 22:33:11
 */
public class AntMerchantExpandScodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1243461722589962724L;

	/**
	 * apply_code_request，申请S码的请求参数
	 */
	@ApiListField("apply_code_request")
	@ApiField("apply_code_request")
	private List<ApplyCodeRequest> applyCodeRequest;

	public List<ApplyCodeRequest> getApplyCodeRequest() {
		return this.applyCodeRequest;
	}
	public void setApplyCodeRequest(List<ApplyCodeRequest> applyCodeRequest) {
		this.applyCodeRequest = applyCodeRequest;
	}

}
