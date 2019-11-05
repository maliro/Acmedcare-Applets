package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 垃圾分类智能识别
 *
 * @author auto create
 * @since 1.0, 2019-07-24 11:09:06
 */
public class AlipayIserviceCognitiveClassificationWasteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8351686385574878992L;

	/**
	 * 业务编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 图片url，或者文本
	 */
	@ApiField("cognition_content")
	private String cognitionContent;

	/**
	 * 垃圾识别类型
	 */
	@ApiField("cognition_type")
	private String cognitionType;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCognitionContent() {
		return this.cognitionContent;
	}
	public void setCognitionContent(String cognitionContent) {
		this.cognitionContent = cognitionContent;
	}

	public String getCognitionType() {
		return this.cognitionType;
	}
	public void setCognitionType(String cognitionType) {
		this.cognitionType = cognitionType;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
