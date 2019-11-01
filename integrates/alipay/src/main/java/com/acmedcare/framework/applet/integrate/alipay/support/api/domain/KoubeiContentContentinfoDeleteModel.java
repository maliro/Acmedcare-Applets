package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑内容删除
 *
 * @author auto create
 * @since 1.0, 2019-03-15 10:29:52
 */
public class KoubeiContentContentinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8874492587652761666L;

	/**
	 * 口碑端内容唯一id，必填
	 */
	@ApiField("content_id")
	private String contentId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
