package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * ODPS元数据查询
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:34:06
 */
public class AlipayDataDataserviceAntdataassetsOdpscolumnQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3472898891468138146L;

	/**
	 * ODPS表的guid
	 */
	@ApiField("guid")
	private String guid;

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}

}
