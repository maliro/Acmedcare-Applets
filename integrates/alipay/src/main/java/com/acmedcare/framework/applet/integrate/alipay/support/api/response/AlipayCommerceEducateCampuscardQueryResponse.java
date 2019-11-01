package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.SchoolCardInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campuscard.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-12 15:42:04
 */
public class AlipayCommerceEducateCampuscardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3579529539718553822L;

	/** 
	 * 学生的校园卡列表
	 */
	@ApiListField("alipay_card_list")
	@ApiField("school_card_info")
	private List<SchoolCardInfo> alipayCardList;

	public void setAlipayCardList(List<SchoolCardInfo> alipayCardList) {
		this.alipayCardList = alipayCardList;
	}
	public List<SchoolCardInfo> getAlipayCardList( ) {
		return this.alipayCardList;
	}

}
