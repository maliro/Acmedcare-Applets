package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 子凭证详细信息
 *
 * @author auto create
 * @since 1.0, 2018-07-25 15:27:12
 */
public class SubCertDetail extends AlipayObject {

	private static final long serialVersionUID = 1149129154212643768L;

	/**
	 * 凭证批次号
	 */
	@ApiField("lot_num")
	private String lotNum;

	/**
	 * 子凭证有效点数
	 */
	@ApiField("lot_point")
	private String lotPoint;

	/**
	 * 子凭证编号
	 */
	@ApiField("sub_lotnum")
	private String subLotnum;

	public String getLotNum() {
		return this.lotNum;
	}
	public void setLotNum(String lotNum) {
		this.lotNum = lotNum;
	}

	public String getLotPoint() {
		return this.lotPoint;
	}
	public void setLotPoint(String lotPoint) {
		this.lotPoint = lotPoint;
	}

	public String getSubLotnum() {
		return this.subLotnum;
	}
	public void setSubLotnum(String subLotnum) {
		this.subLotnum = subLotnum;
	}

}
