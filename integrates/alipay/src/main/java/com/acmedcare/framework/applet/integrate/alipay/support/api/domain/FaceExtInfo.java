package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 人脸复杂类型
 *
 * @author auto create
 * @since 1.0, 2018-11-23 12:57:41
 */
public class FaceExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3414958172393831879L;

	/**
	 * query_type不填, 返回uid
query_type=1, 返回手机号
query_type=2, 返回图片
	 */
	@ApiField("query_type")
	private String queryType;

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
