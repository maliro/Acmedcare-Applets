package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.TreeData;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.forest.tree.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 12:30:01
 */
public class AlipaySocialForestTreeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3384364935437696123L;

	/** 
	 * 森林开通状态：
NON_OPEN：未开通；【种树记录列表为空list】
OPEN：已开通；
CLOSED：已关闭；
	 */
	@ApiField("forest_status")
	private String forestStatus;

	/** 
	 * 数据格式为List<TreeData>，按树种、是否合种分类统计后得到用户种植树信息数据列表
	 */
	@ApiListField("tree_datas")
	@ApiField("tree_data")
	private List<TreeData> treeDatas;

	public void setForestStatus(String forestStatus) {
		this.forestStatus = forestStatus;
	}
	public String getForestStatus( ) {
		return this.forestStatus;
	}

	public void setTreeDatas(List<TreeData> treeDatas) {
		this.treeDatas = treeDatas;
	}
	public List<TreeData> getTreeDatas( ) {
		return this.treeDatas;
	}

}
