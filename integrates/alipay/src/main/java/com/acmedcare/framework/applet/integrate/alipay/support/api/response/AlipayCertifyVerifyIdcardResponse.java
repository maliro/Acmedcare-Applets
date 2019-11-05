package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.certify.verify.idcard response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayCertifyVerifyIdcardResponse extends AlipayResponse {

	private static final long serialVersionUID = 1283629434954413492L;

	/** 
	 * 校验结果JSON串
	 */
	@ApiField("result")
	private String result;

	/** 
	 * * 00  公民身份号码与姓名一致，且存在照片,上传照片，返回匹配
* 01  公民身份号码与姓名一致，但不存在照片，返回匹配
* 02  公民身份号码存在，但与姓名不匹配，返回不匹配
* 03  公民身份号码不存在，返回没有此人
* 04  其他错误，返回第三方错误
* 05  输入的参数错误，返回第三方错误
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
