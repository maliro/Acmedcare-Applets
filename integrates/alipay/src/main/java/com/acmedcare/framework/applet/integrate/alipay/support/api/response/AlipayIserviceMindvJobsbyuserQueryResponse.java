package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.mindv.jobsbyuser.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceMindvJobsbyuserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4197932123812637631L;

	/** 
	 * 用户填写的任务id列表
	 */
	@ApiListField("job_ids")
	@ApiField("number")
	private List<Long> jobIds;

	public void setJobIds(List<Long> jobIds) {
		this.jobIds = jobIds;
	}
	public List<Long> getJobIds( ) {
		return this.jobIds;
	}

}
