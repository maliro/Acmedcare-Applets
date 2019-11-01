package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.recordexist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-11 15:40:00
 */
public class AlipayUserCharityRecordexistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5452115721496716146L;

	/** 
	 * 是否有过捐赠记录(有:true,否:false)
	 */
	@ApiField("donation_tag")
	private Boolean donationTag;

	/** 
	 * 爱心捐赠平台捐赠的次数
	 */
	@ApiField("donation_times")
	private Long donationTimes;

	public void setDonationTag(Boolean donationTag) {
		this.donationTag = donationTag;
	}
	public Boolean getDonationTag( ) {
		return this.donationTag;
	}

	public void setDonationTimes(Long donationTimes) {
		this.donationTimes = donationTimes;
	}
	public Long getDonationTimes( ) {
		return this.donationTimes;
	}

}
