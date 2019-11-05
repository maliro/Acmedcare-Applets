package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 回传码物料码值
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:42:39
 */
public class KoubeiSalesKbassetStuffQrcodereturnSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1332727294863711294L;

	/**
	 * 供应商回传码物料码值记录（最多200条）
	 */
	@ApiListField("return_qrcodes")
	@ApiField("access_return_qrcode")
	private List<AccessReturnQrcode> returnQrcodes;

	public List<AccessReturnQrcode> getReturnQrcodes() {
		return this.returnQrcodes;
	}
	public void setReturnQrcodes(List<AccessReturnQrcode> returnQrcodes) {
		this.returnQrcodes = returnQrcodes;
	}

}
