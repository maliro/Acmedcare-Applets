package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OpenBatch;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiQualityTestCloudacptBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1617267931186498787L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 批次列表
	 */
	@ApiListField("batch_list")
	@ApiField("open_batch")
	private List<OpenBatch> batchList;

	/** 
	 * 单品批次数
	 */
	@ApiField("batch_num")
	private String batchNum;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setBatchList(List<OpenBatch> batchList) {
		this.batchList = batchList;
	}
	public List<OpenBatch> getBatchList( ) {
		return this.batchList;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}
	public String getBatchNum( ) {
		return this.batchNum;
	}

}
