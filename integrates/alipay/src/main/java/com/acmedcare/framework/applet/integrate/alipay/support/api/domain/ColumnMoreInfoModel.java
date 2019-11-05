package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2018-11-29 16:37:36
 */
public class ColumnMoreInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3538751929127586247L;

	/**
	 * 选择opennative的时候必须填写descs的内容
	 */
	@ApiListField("descs")
	@ApiField("string")
	private List<String> descs;

	/**
	 * 扩展参数，需要URL地址回带的值，JSON格式(openweb时填)
	 */
	@ApiField("params")
	private String params;

	/**
	 * 二级页面标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 超链接(选择openweb的时候必须填写url参数内容)
	 */
	@ApiField("url")
	private String url;

	public List<String> getDescs() {
		return this.descs;
	}
	public void setDescs(List<String> descs) {
		this.descs = descs;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
