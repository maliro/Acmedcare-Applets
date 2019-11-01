package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 生产单数据码对象
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:58:15
 */
public class AccessProduceQrcode extends AlipayObject {

	private static final long serialVersionUID = 5523942297952641967L;

	/**
	 * 口碑码批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 码url
	 */
	@ApiField("core_url")
	private String coreUrl;

	/**
	 * 生产单号
	 */
	@ApiField("produce_order_id")
	private String produceOrderId;

	/**
	 * 二维码编码
	 */
	@ApiField("qrcode")
	private String qrcode;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCoreUrl() {
		return this.coreUrl;
	}
	public void setCoreUrl(String coreUrl) {
		this.coreUrl = coreUrl;
	}

	public String getProduceOrderId() {
		return this.produceOrderId;
	}
	public void setProduceOrderId(String produceOrderId) {
		this.produceOrderId = produceOrderId;
	}

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
