package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 营业执照图片识别对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 18:14:44
 */
public class AlipayEcoLicenseOcrIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 6745521434873243345L;

	/**
	 * 图片字节byte[]经过base64处理的字符串
	 */
	@ApiField("image")
	private String image;

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
