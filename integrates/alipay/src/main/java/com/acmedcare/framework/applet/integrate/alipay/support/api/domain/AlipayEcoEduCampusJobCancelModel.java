package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 实习生职位下线接口
 *
 * @author auto create
 * @since 1.0, 2019-06-27 13:58:16
 */
public class AlipayEcoEduCampusJobCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4566352483554158965L;

	/**
	 * 职位来源方编码
	 */
	@ApiField("source_code")
	private String sourceCode;

	/**
	 * 职位在合作方的ID
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}