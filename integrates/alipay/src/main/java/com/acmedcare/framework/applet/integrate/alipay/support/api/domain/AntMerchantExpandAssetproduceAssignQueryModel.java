package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 获取生产指令接口
 *
 * @author auto create
 * @since 1.0, 2018-07-30 13:46:00
 */
public class AntMerchantExpandAssetproduceAssignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3126574916639573517L;

	/**
	 * 每次拉取最大记录数量，可选值为[1,200] ;
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
