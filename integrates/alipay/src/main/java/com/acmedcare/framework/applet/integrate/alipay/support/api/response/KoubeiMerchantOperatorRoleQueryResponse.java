package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KoubeiMerchantRole;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.role.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantOperatorRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3317672656266546389L;

	/** 
	 * 角色信息包含角色ID和角色名称,以及权限汇总信息
	 */
	@ApiListField("list")
	@ApiField("koubei_merchant_role")
	private List<KoubeiMerchantRole> list;

	public void setList(List<KoubeiMerchantRole> list) {
		this.list = list;
	}
	public List<KoubeiMerchantRole> getList( ) {
		return this.list;
	}

}
