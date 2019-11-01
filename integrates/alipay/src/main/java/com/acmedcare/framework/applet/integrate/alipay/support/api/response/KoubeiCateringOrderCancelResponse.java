package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.RefundDescriptionDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-13 20:58:29
 */
public class KoubeiCateringOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 3136128644821316681L;

	/** 
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 口碑端订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 退款明细列表
	 */
	@ApiListField("refund_description_list")
	@ApiField("refund_description_d_t_o")
	private List<RefundDescriptionDTO> refundDescriptionList;

	/** 
	 * 是否需要重试，true-需要，false-不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRefundDescriptionList(List<RefundDescriptionDTO> refundDescriptionList) {
		this.refundDescriptionList = refundDescriptionList;
	}
	public List<RefundDescriptionDTO> getRefundDescriptionList( ) {
		return this.refundDescriptionList;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
