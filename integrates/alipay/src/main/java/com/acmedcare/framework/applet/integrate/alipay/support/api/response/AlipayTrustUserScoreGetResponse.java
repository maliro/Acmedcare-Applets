package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AliTrustScore;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayTrustUserScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1649816149683829575L;

	/** 
	 * 芝麻信用通过模型计算出的该用户的芝麻信用评分
	 */
	@ApiField("ali_trust_score")
	private AliTrustScore aliTrustScore;

	public void setAliTrustScore(AliTrustScore aliTrustScore) {
		this.aliTrustScore = aliTrustScore;
	}
	public AliTrustScore getAliTrustScore( ) {
		return this.aliTrustScore;
	}

}
