package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 语音合成
 *
 * @author auto create
 * @since 1.0, 2019-06-20 20:45:34
 */
public class AlipayCommerceIotDeviceAudioCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7155789433387638376L;

	/**
	 * 文本内容. 文本的最大长度为25个字符.注意: 语音合成不支持英文字母和!,@,#,$,%,^...等特殊字符, 如果包含则会自动过滤
	 */
	@ApiField("text")
	private String text;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
