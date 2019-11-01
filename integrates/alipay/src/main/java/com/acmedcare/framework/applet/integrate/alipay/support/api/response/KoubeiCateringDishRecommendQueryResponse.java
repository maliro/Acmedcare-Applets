package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.DishRecommend;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringDishRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859529955265457534L;

	/** 
	 * 推荐菜品列表
	 */
	@ApiListField("dish_list")
	@ApiField("dish_recommend")
	private List<DishRecommend> dishList;

	public void setDishList(List<DishRecommend> dishList) {
		this.dishList = dishList;
	}
	public List<DishRecommend> getDishList( ) {
		return this.dishList;
	}

}
