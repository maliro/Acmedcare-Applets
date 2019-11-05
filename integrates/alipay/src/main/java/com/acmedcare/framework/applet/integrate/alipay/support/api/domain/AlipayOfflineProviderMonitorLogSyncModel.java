package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * ISV服务商监控数据回流
 *
 * @author auto create
 * @since 1.0, 2016-09-28 11:33:15
 */
public class AlipayOfflineProviderMonitorLogSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3741992155694253518L;

	/**
	 * 数据回流日志
	 */
	@ApiListField("logs")
	@ApiField("i_s_v_log_sync")
	private List<ISVLogSync> logs;

	public List<ISVLogSync> getLogs() {
		return this.logs;
	}
	public void setLogs(List<ISVLogSync> logs) {
		this.logs = logs;
	}

}
