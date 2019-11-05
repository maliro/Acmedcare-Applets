package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 单元定向
 *
 * @author auto create
 * @since 1.0, 2019-08-14 21:37:06
 */
public class OuterTargetingItem extends AlipayObject {

	private static final long serialVersionUID = 5186645279479796696L;

	/**
	 * 定向类型：
GENDER_TAG_LIST：性别
AGE_TAG_LIST：年龄段
INTEREST_TAG_LIST：兴趣偏好
RESIDENCE_LEVEL_LIST：常住地城市等级
RESIDENCE_TAG_LIST:常住地省市
REGION_LIST: 实时地址
MEDIA_TRADE_LIST:媒体行业
MEDIA_REGION_LIST:媒体省市
CROWD_LIST:行业主题人群
OS_LIST:操作系统
DEVICE_PRICE_LIST:价格区间
DEVICE_BRAND_LIST:品牌
DEVICE_NET_LIST:运营商
DEVICE_NETWORK_LIST:网络类型
DEVICE_TYPE_LIST:设备类型
USER_ACTIVE_TAG_LIST:用户活跃定向
AD_POS_LIST: 广告位定向
OUTER_TAG_LIST: 外部扩展tag定向
	 */
	@ApiField("type")
	private String type;

	/**
	 * 定向值
	 */
	@ApiListField("value_list")
	@ApiField("string")
	private List<String> valueList;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<String> getValueList() {
		return this.valueList;
	}
	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}

}
