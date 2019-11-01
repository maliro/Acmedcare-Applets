package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 商户自主监控日志数据上报接口
 *
 * @author auto create
 * @since 1.0, 2019-03-20 14:35:50
 */
public class AlipayCommerceDataLogdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2379478351188224692L;

	/**
	 * 商户自定义监控原始日志数据
	 */
	@ApiField("log")
	private String log;

	/**
	 * 命名空间，商户与支付宝进行监控共建场景使用，命令空间需要先在云监控自定义监控页面配置录入。
	 */
	@ApiField("namespace")
	private String namespace;

	public String getLog() {
		return this.log;
	}
	public void setLog(String log) {
		this.log = log;
	}

	public String getNamespace() {
		return this.namespace;
	}
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

}
