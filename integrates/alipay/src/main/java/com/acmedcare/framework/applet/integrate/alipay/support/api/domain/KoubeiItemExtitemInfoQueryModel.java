package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 外部商品(关联品类，品牌)单个查询
 *
 * @author auto create
 * @since 1.0, 2017-09-27 17:56:42
 */
public class KoubeiItemExtitemInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3745742846448488364L;

	/**
	 * 商品编码
	 */
	@ApiField("goods_id")
	private String goodsId;

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

}
