package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PaymentSchedule;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.drawndn.paymentschedule.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEcapiprodDrawndnPaymentscheduleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7712118435243274979L;

	/** 
	 * 返回的支用还款计划集合
	 */
	@ApiListField("payment_schedules")
	@ApiField("payment_schedule")
	private List<PaymentSchedule> paymentSchedules;

	/** 
	 * 唯一标识这次请求
	 */
	@ApiField("request_id")
	private String requestId;

	public void setPaymentSchedules(List<PaymentSchedule> paymentSchedules) {
		this.paymentSchedules = paymentSchedules;
	}
	public List<PaymentSchedule> getPaymentSchedules( ) {
		return this.paymentSchedules;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
