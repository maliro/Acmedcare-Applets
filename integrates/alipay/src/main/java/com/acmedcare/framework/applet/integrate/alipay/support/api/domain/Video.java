package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 视频
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class Video extends AlipayObject {

	private static final long serialVersionUID = 4833896862229699142L;

	/**
	 * 调用alipay.offline.material.image.upload接口将视频上传到素材中心后，生成的ID
	 */
	@ApiField("location")
	private String location;

	/**
	 * 视频名称
	 */
	@ApiField("name")
	private String name;

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
