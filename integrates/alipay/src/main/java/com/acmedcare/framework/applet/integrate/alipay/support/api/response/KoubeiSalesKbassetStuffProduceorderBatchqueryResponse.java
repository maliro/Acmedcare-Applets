package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AccessProduceOrder;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.produceorder.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiSalesKbassetStuffProduceorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7475264838314582522L;

	/** 
	 * 当前是否还有生产指令可以拉取; 注意如果该值为false, 也只是提示当前没有更多生产指令了, 不代表后面没有生产指令, 商户需要自己制定策略定时去拉取.
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 生产单结果列表
	 */
	@ApiListField("list")
	@ApiField("access_produce_order")
	private List<AccessProduceOrder> list;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setList(List<AccessProduceOrder> list) {
		this.list = list;
	}
	public List<AccessProduceOrder> getList( ) {
		return this.list;
	}

}
