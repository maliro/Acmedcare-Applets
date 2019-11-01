package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.KbItemInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.taobao.index.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiItemTaobaoIndexQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3631647277298315917L;

	/** 
	 * 栏目名称
	 */
	@ApiField("column_title")
	private String columnTitle;

	/** 
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("item_list")
	@ApiField("kb_item_info")
	private List<KbItemInfo> itemList;

	/** 
	 * 时段图标
	 */
	@ApiField("time_icon")
	private String timeIcon;

	/** 
	 * 时段名称
	 */
	@ApiField("time_title")
	private String timeTitle;

	/** 
	 * 商品列表页地址
	 */
	@ApiField("url")
	private String url;

	public void setColumnTitle(String columnTitle) {
		this.columnTitle = columnTitle;
	}
	public String getColumnTitle( ) {
		return this.columnTitle;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setItemList(List<KbItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<KbItemInfo> getItemList( ) {
		return this.itemList;
	}

	public void setTimeIcon(String timeIcon) {
		this.timeIcon = timeIcon;
	}
	public String getTimeIcon( ) {
		return this.timeIcon;
	}

	public void setTimeTitle(String timeTitle) {
		this.timeTitle = timeTitle;
	}
	public String getTimeTitle( ) {
		return this.timeTitle;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
