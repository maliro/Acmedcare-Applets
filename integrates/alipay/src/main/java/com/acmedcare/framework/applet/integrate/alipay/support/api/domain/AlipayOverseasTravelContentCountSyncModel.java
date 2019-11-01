package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 飞猪内容对接内容阅读数点赞数同步接口
 *
 * @author auto create
 * @since 1.0, 2017-11-29 17:17:03
 */
public class AlipayOverseasTravelContentCountSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5263226491117497992L;

	/**
	 * 计数信息列表
	 */
	@ApiListField("count_infos")
	@ApiField("count_info")
	private List<CountInfo> countInfos;

	public List<CountInfo> getCountInfos() {
		return this.countInfos;
	}
	public void setCountInfos(List<CountInfo> countInfos) {
		this.countInfos = countInfos;
	}

}
