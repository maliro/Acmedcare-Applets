package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 表格类型的图片信息抽取服务
 *
 * @author auto create
 * @since 1.0, 2018-07-04 14:04:09
 */
public class AlipayIserviceCognitiveOcrTablesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8357314684295422932L;

	/**
	 * 图片base64后内容，大小控制在1M以内
	 */
	@ApiField("image_content")
	private String imageContent;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
