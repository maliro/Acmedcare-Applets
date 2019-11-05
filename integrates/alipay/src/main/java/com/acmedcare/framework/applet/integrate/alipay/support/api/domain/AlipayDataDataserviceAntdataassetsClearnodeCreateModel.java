package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 清除上云任务
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:25:22
 */
public class AlipayDataDataserviceAntdataassetsClearnodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3475159638731616537L;

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
