package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.MachineType;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.machinetype.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-20 15:40:01
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinetypeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5799127657821517523L;

	/** 
	 * 视觉货柜机型信息列表
	 */
	@ApiListField("machine_types")
	@ApiField("machine_type")
	private List<MachineType> machineTypes;

	public void setMachineTypes(List<MachineType> machineTypes) {
		this.machineTypes = machineTypes;
	}
	public List<MachineType> getMachineTypes( ) {
		return this.machineTypes;
	}

}
