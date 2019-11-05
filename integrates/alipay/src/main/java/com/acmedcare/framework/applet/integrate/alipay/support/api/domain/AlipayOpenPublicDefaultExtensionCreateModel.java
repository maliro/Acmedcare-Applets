package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 默认扩展区创建接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:46:49
 */
public class AlipayOpenPublicDefaultExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6622668777346522156L;

	/**
	 * 默认扩展区列表，最多包含3个扩展区
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

}
