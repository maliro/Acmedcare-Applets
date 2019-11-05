package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 上数元数据信息同步服务
 *
 * @author auto create
 * @since 1.0, 2019-04-09 15:45:45
 */
public class SsdataDataserviceMetainfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8313837663787396541L;

	/**
	 * 元数据信息
	 */
	@ApiField("meta_info")
	private String metaInfo;

	public String getMetaInfo() {
		return this.metaInfo;
	}
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

}
