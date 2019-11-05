package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.Date;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.token.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-17 16:30:01
 */
public class AlipayCommerceKidsTokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8561477149732242948L;

	/** 
	 * 过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * token
	 */
	@ApiField("kids_token")
	private String kidsToken;

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setKidsToken(String kidsToken) {
		this.kidsToken = kidsToken;
	}
	public String getKidsToken( ) {
		return this.kidsToken;
	}

}
