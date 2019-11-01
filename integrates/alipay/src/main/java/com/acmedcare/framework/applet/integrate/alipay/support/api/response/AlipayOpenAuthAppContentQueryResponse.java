package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.Agreement;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAuthAppContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3291564458995553224L;

	/** 
	 * 授权协议列表
	 */
	@ApiListField("agreement")
	@ApiField("agreement")
	private List<Agreement> agreement;

	/** 
	 * 授权范围描述
	 */
	@ApiListField("auth_text")
	@ApiField("string")
	private List<String> authText;

	public void setAgreement(List<Agreement> agreement) {
		this.agreement = agreement;
	}
	public List<Agreement> getAgreement( ) {
		return this.agreement;
	}

	public void setAuthText(List<String> authText) {
		this.authText = authText;
	}
	public List<String> getAuthText( ) {
		return this.authText;
	}

}
