package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 测试文档更新
 *
 * @author auto create
 * @since 1.0, 2019-09-18 23:46:10
 */
public class AlipayOpenAppDfsfasDeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4381369989874297552L;

	/**
	 * 1
	 */
	@ApiField("desd")
	private String desd;

	/**
	 * 1
	 */
	@ApiField("desdde")
	private String desdde;

	public String getDesd() {
		return this.desd;
	}
	public void setDesd(String desd) {
		this.desd = desd;
	}

	public String getDesdde() {
		return this.desdde;
	}
	public void setDesdde(String desdde) {
		this.desdde = desdde;
	}

}
