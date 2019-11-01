package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 同步leads数据
 *
 * @author auto create
 * @since 1.0, 2019-07-12 14:20:08
 */
public class KoubeiCateringBizMovehomeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8421378336792922399L;

	/**
	 * leads信息列表
	 */
	@ApiListField("leads_info_list")
	@ApiField("kcp_leads_info")
	private List<KcpLeadsInfo> leadsInfoList;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	public List<KcpLeadsInfo> getLeadsInfoList() {
		return this.leadsInfoList;
	}
	public void setLeadsInfoList(List<KcpLeadsInfo> leadsInfoList) {
		this.leadsInfoList = leadsInfoList;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
