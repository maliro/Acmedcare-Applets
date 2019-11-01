package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 间连商户文件上传
 *
 * @author auto create
 * @since 1.0, 2019-05-15 11:16:46
 */
public class AntMerchantExpandIndirectAttachmentUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1346358456171323756L;

	/**
	 * 商户附件信息
	 */
	@ApiListField("attachment_info")
	@ApiField("attachment_info")
	private List<AttachmentInfo> attachmentInfo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public List<AttachmentInfo> getAttachmentInfo() {
		return this.attachmentInfo;
	}
	public void setAttachmentInfo(List<AttachmentInfo> attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
