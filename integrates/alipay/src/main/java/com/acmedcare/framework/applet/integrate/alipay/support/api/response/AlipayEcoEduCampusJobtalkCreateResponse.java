package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.jobtalk.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-27 13:59:16
 */
public class AlipayEcoEduCampusJobtalkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3448945638929121154L;

	/** 
	 * 备注问题，或者异常
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 返回code编码;成功返回SUCCESS
	 */
	@ApiField("isv_code")
	private String isvCode;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	public String getIsvCode( ) {
		return this.isvCode;
	}

}