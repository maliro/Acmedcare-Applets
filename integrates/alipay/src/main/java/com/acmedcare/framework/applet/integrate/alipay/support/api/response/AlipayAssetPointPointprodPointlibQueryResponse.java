package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.PointLibResult;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.pointlib.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-30 17:14:12
 */
public class AlipayAssetPointPointprodPointlibQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2363674336249249711L;

	/** 
	 * 集分宝积分库查询结果，包含积分库ID，名称，余额等
	 */
	@ApiField("result")
	private PointLibResult result;

	public void setResult(PointLibResult result) {
		this.result = result;
	}
	public PointLibResult getResult( ) {
		return this.result;
	}

}
