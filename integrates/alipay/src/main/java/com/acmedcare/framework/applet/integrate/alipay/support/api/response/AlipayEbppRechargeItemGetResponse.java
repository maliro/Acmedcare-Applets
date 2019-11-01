package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ItermInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.item.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppRechargeItemGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6819254146276828767L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 系统返回错误码
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 充值面额状态对象list
	 */
	@ApiListField("iterm_infos")
	@ApiField("iterm_info")
	private List<ItermInfo> itermInfos;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setItermInfos(List<ItermInfo> itermInfos) {
		this.itermInfos = itermInfos;
	}
	public List<ItermInfo> getItermInfos( ) {
		return this.itermInfos;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
