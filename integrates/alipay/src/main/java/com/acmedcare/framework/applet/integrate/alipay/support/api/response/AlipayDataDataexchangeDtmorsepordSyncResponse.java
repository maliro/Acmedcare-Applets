package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.dtmorsepord.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataexchangeDtmorsepordSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6339288318977513972L;

	/** 
	 * 交易流水号，一次交易的唯一标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 结果扩展字段，用于补充出参内容
	 */
	@ApiField("result_extent")
	private String resultExtent;

	/** 
	 * 操作结果信息，用于标识操作是否成功。true：表示成功，false：表示失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setResultExtent(String resultExtent) {
		this.resultExtent = resultExtent;
	}
	public String getResultExtent( ) {
		return this.resultExtent;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
