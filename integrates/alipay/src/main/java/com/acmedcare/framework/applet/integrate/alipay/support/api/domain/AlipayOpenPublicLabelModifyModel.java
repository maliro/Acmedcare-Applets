package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 修改标签接口
 *
 * @author auto create
 * @since 1.0, 2018-12-25 17:15:00
 */
public class AlipayOpenPublicLabelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2659887788396737922L;

	/**
	 * 要修改的标签id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 要修改成的标签名
	 */
	@ApiField("name")
	private String name;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
