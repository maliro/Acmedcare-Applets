package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 租户应用服务数据
 *
 * @author auto create
 * @since 1.0, 2019-01-15 01:41:20
 */
public class CommerceAppUploadRequestContent extends AlipayObject {

	private static final long serialVersionUID = 7559529958728291886L;

	/**
	 * 租户应用业务流程ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 租户应用业务流程内容
	 */
	@ApiField("body")
	private String body;

	/**
	 * 查询条件
	 */
	@ApiField("query")
	private String query;

	/**
	 * 租户应用ID
	 */
	@ApiField("tenant_app_id")
	private String tenantAppId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getTenantAppId() {
		return this.tenantAppId;
	}
	public void setTenantAppId(String tenantAppId) {
		this.tenantAppId = tenantAppId;
	}

}
