package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.template.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-08 20:00:10
 */
public class AlipayPassTemplateAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2578225617436776314L;

	/** 
	 * 接口调用返回结果信息(json字串):
errorCode：处理结果码（错误码）；
errorMsg：处理结果说明（错误说明）；
tpl_id：模板编号，预期在调发券接口时必须传入；
tpl_params：动态参数（变量）列表，预期在调发券接口时传入；
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}