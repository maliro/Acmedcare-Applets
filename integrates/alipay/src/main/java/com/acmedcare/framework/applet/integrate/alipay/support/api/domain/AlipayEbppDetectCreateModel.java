package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 创建准入检测任务
 *
 * @author auto create
 * @since 1.0, 2019-03-20 21:38:06
 */
public class AlipayEbppDetectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2779731744232944266L;

	/**
	 * 业务类型。巡检平台统一分配。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 数据来源（一般为系统名称）
	 */
	@ApiField("data_from_type")
	private String dataFromType;

	/**
	 * 外部业务标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 检测项列表。支持对链接url、纯文本、图片进行检测。
	 */
	@ApiListField("service_list")
	@ApiField("detect_service_entity")
	private List<DetectServiceEntity> serviceList;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDataFromType() {
		return this.dataFromType;
	}
	public void setDataFromType(String dataFromType) {
		this.dataFromType = dataFromType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<DetectServiceEntity> getServiceList() {
		return this.serviceList;
	}
	public void setServiceList(List<DetectServiceEntity> serviceList) {
		this.serviceList = serviceList;
	}

}
