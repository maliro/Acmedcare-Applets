package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.CaseInfoCode;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.auto.fraud.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsDataAutoFraudQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7216181755677773674L;

	/** 
	 * 案件欺诈名单类型：

BLACK:黑名单。高风险，需重点调查
GRAY:灰名单。较高风险
WHITE:白名单。风险较低
	 */
	@ApiField("fraud_tag")
	private String fraudTag;

	/** 
	 * 反欺诈名单标识下的档位，从字母A开始编号，A为最高风险。目前每种名单下为六档，白名单下没有档位
	 */
	@ApiField("fraud_tag_level")
	private String fraudTagLevel;

	/** 
	 * 情报代码列表，可选输出项
	 */
	@ApiListField("info_code_list")
	@ApiField("case_info_code")
	private List<CaseInfoCode> infoCodeList;

	public void setFraudTag(String fraudTag) {
		this.fraudTag = fraudTag;
	}
	public String getFraudTag( ) {
		return this.fraudTag;
	}

	public void setFraudTagLevel(String fraudTagLevel) {
		this.fraudTagLevel = fraudTagLevel;
	}
	public String getFraudTagLevel( ) {
		return this.fraudTagLevel;
	}

	public void setInfoCodeList(List<CaseInfoCode> infoCodeList) {
		this.infoCodeList = infoCodeList;
	}
	public List<CaseInfoCode> getInfoCodeList( ) {
		return this.infoCodeList;
	}

}