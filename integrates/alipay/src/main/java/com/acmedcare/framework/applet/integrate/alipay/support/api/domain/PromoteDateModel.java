package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 口碑客推广日期维度汇总数据模型
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:10
 */
public class PromoteDateModel extends AlipayObject {

	private static final long serialVersionUID = 8738662531994786467L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 推广数据
	 */
	@ApiField("promote_data")
	private PromoteDataModel promoteData;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public PromoteDataModel getPromoteData() {
		return this.promoteData;
	}
	public void setPromoteData(PromoteDataModel promoteData) {
		this.promoteData = promoteData;
	}

}
