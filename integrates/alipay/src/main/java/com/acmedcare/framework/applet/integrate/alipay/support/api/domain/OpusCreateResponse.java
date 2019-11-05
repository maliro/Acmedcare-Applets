package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 作品查询信息
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:35:20
 */
public class OpusCreateResponse extends AlipayObject {

	private static final long serialVersionUID = 1562425732932289467L;

	/**
	 * 作品外部id
	 */
	@ApiField("external_opus_id")
	private String externalOpusId;

	/**
	 * 作品id
	 */
	@ApiField("opus_id")
	private String opusId;

	public String getExternalOpusId() {
		return this.externalOpusId;
	}
	public void setExternalOpusId(String externalOpusId) {
		this.externalOpusId = externalOpusId;
	}

	public String getOpusId() {
		return this.opusId;
	}
	public void setOpusId(String opusId) {
		this.opusId = opusId;
	}

}
