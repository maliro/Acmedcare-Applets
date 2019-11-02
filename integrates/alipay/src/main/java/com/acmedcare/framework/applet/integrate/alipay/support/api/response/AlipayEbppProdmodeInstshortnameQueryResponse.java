package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.instshortname.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppProdmodeInstshortnameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1127717966925832952L;

	/** 
	 * 出账机构中文名称
	 */
	@ApiField("chargeinst_cn_name")
	private String chargeinstCnName;

	/** 
	 * 出账机构英文名称
	 */
	@ApiField("chargeinst_en_name")
	private String chargeinstEnName;

	public void setChargeinstCnName(String chargeinstCnName) {
		this.chargeinstCnName = chargeinstCnName;
	}
	public String getChargeinstCnName( ) {
		return this.chargeinstCnName;
	}

	public void setChargeinstEnName(String chargeinstEnName) {
		this.chargeinstEnName = chargeinstEnName;
	}
	public String getChargeinstEnName( ) {
		return this.chargeinstEnName;
	}

}