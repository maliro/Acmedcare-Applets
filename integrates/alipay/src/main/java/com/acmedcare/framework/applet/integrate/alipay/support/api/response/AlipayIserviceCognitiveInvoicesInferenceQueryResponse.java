package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TaxBillContent;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.invoices.inference.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-05 20:08:00
 */
public class AlipayIserviceCognitiveInvoicesInferenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8851826383617325221L;

	/** 
	 * 算法版本
	 */
	@ApiField("algo_version")
	private String algoVersion;

	/** 
	 * 增值税发票内容
	 */
	@ApiField("content")
	private TaxBillContent content;

	/** 
	 * 当ret不为0，err_msg记录详细错误原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 返回值
	 */
	@ApiField("ret")
	private String ret;

	public void setAlgoVersion(String algoVersion) {
		this.algoVersion = algoVersion;
	}
	public String getAlgoVersion( ) {
		return this.algoVersion;
	}

	public void setContent(TaxBillContent content) {
		this.content = content;
	}
	public TaxBillContent getContent( ) {
		return this.content;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setRet(String ret) {
		this.ret = ret;
	}
	public String getRet( ) {
		return this.ret;
	}

}
