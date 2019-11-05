package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 间连天梭绑定接口
 *
 * @author auto create
 * @since 1.0, 2019-08-13 12:56:41
 */
public class AntMerchantExpandIndirectTiansuoBindModel extends AlipayObject {

	private static final long serialVersionUID = 3175533385742563136L;

	/**
	 * 间连天梭绑定isv列表
	 */
	@ApiListField("tiansuo_isv_bind_list")
	@ApiField("tiansuo_isv_bind_v_o")
	private List<TiansuoIsvBindVO> tiansuoIsvBindList;

	public List<TiansuoIsvBindVO> getTiansuoIsvBindList() {
		return this.tiansuoIsvBindList;
	}
	public void setTiansuoIsvBindList(List<TiansuoIsvBindVO> tiansuoIsvBindList) {
		this.tiansuoIsvBindList = tiansuoIsvBindList;
	}

}
