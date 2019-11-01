package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.open.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCertifyOpenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4145914286716562193L;

	/** 
	 * 认证的主体信息，一般的认证场景返回为空
	 */
	@ApiField("identity_info")
	private String identityInfo;

	/** 
	 * 认证主体附件信息，主要为图片类材料，一般的认证场景都是返回空
	 */
	@ApiField("material_info")
	private String materialInfo;

	/** 
	 * 是否通过，通过为T，不通过为F
	 */
	@ApiListField("passed")
	@ApiField("string")
	private List<String> passed;

	public void setIdentityInfo(String identityInfo) {
		this.identityInfo = identityInfo;
	}
	public String getIdentityInfo( ) {
		return this.identityInfo;
	}

	public void setMaterialInfo(String materialInfo) {
		this.materialInfo = materialInfo;
	}
	public String getMaterialInfo( ) {
		return this.materialInfo;
	}

	public void setPassed(List<String> passed) {
		this.passed = passed;
	}
	public List<String> getPassed( ) {
		return this.passed;
	}

}
