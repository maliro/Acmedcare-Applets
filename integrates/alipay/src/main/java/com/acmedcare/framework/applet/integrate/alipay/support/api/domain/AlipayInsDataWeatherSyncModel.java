package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 天气数据同步接口
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:29
 */
public class AlipayInsDataWeatherSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6485724838918487285L;

	/**
	 * 天气信息描述信息
	 */
	@ApiField("content")
	private String content;

	/**
	 * 外部业务幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
