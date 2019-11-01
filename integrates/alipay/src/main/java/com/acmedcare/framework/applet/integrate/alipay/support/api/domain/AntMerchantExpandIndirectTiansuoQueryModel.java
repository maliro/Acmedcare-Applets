package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 间连天梭查询接口
 *
 * @author auto create
 * @since 1.0, 2019-08-13 12:56:31
 */
public class AntMerchantExpandIndirectTiansuoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7583769458152696774L;

	/**
	 * 间连商户入驻时填写的营业执照号
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

}
