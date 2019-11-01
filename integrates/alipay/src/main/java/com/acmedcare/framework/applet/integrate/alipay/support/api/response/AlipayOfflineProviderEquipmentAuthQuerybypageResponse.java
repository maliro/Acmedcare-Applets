package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.EquipmentAuthRemoveQueryBypageDTO;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.equipment.auth.querybypage response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineProviderEquipmentAuthQuerybypageResponse extends AlipayResponse {

	private static final long serialVersionUID = 7311958953499161661L;

	/** 
	 * 机具解绑按照条件分页查询返回信息
	 */
	@ApiListField("equipmentauthremovequerybypagelist")
	@ApiField("equipment_auth_remove_query_bypage_d_t_o")
	private List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist;

	/** 
	 * 总记录数
	 */
	@ApiField("total")
	private Long total;

	public void setEquipmentauthremovequerybypagelist(List<EquipmentAuthRemoveQueryBypageDTO> equipmentauthremovequerybypagelist) {
		this.equipmentauthremovequerybypagelist = equipmentauthremovequerybypagelist;
	}
	public List<EquipmentAuthRemoveQueryBypageDTO> getEquipmentauthremovequerybypagelist( ) {
		return this.equipmentauthremovequerybypagelist;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
