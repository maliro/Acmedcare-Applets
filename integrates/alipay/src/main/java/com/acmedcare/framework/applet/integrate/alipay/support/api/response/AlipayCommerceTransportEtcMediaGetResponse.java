package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MediaContentList;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.media.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-28 21:19:49
 */
public class AlipayCommerceTransportEtcMediaGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7575554633146884114L;

	/** 
	 * 申请单资料列表
	 */
	@ApiListField("content_list")
	@ApiField("media_content_list")
	private List<MediaContentList> contentList;

	/** 
	 * etc申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务申请单id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setContentList(List<MediaContentList> contentList) {
		this.contentList = contentList;
	}
	public List<MediaContentList> getContentList( ) {
		return this.contentList;
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

}
