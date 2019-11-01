package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PromoxCrowdMatchModel;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.antlbs.crowd.match response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceAntlbsCrowdMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1622813181894977725L;

	/** 
	 * 匹配结果，入参中每个客群码都会返回是否匹配，即使该客群不存在
	 */
	@ApiListField("match_result")
	@ApiField("promox_crowd_match_model")
	private List<PromoxCrowdMatchModel> matchResult;

	public void setMatchResult(List<PromoxCrowdMatchModel> matchResult) {
		this.matchResult = matchResult;
	}
	public List<PromoxCrowdMatchModel> getMatchResult( ) {
		return this.matchResult;
	}

}
