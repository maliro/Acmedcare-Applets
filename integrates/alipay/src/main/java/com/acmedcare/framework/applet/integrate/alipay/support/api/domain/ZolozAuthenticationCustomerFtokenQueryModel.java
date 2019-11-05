package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 人脸ftoken查询消费接口
 *
 * @author auto create
 * @since 1.0, 2018-11-30 23:08:01
 */
public class ZolozAuthenticationCustomerFtokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3554466651844555679L;

	/**
	 * 1、1：1人脸验证能力
2、1：n人脸搜索能力（支付宝uid入库）
3、1：n人脸搜索能力（支付宝手机号入库）
4、手机号和人脸识别综合能力
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 人脸产品拓展参数
	 */
	@ApiField("ext_info")
	private FaceExtInfo extInfo;

	/**
	 * 人脸token
	 */
	@ApiField("ftoken")
	private String ftoken;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public FaceExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(FaceExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

}
