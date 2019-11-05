package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.InsOffilneProduct;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.product.offline.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationProductOfflineBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4782521971194183938L;

	/** 
	 * 返回给机构的线下产品信息列表
	 */
	@ApiListField("product_list")
	@ApiField("ins_offilne_product")
	private List<InsOffilneProduct> productList;

	public void setProductList(List<InsOffilneProduct> productList) {
		this.productList = productList;
	}
	public List<InsOffilneProduct> getProductList( ) {
		return this.productList;
	}

}
