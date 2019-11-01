package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 板块信息
 *
 * @author auto create
 * @since 1.0, 2018-09-25 20:13:38
 */
public class PlateInfoForYiCai extends AlipayObject {

	private static final long serialVersionUID = 5815779277915567989L;

	/**
	 * 板块所属类型
	 */
	@ApiField("category")
	private String category;

	/**
	 * 板块的ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 板块名称
	 */
	@ApiField("plate_name")
	private String plateName;

	/**
	 * 股票代码和股票名称
	 */
	@ApiListField("symbol_name")
	@ApiField("string")
	private List<String> symbolName;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPlateName() {
		return this.plateName;
	}
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}

	public List<String> getSymbolName() {
		return this.symbolName;
	}
	public void setSymbolName(List<String> symbolName) {
		this.symbolName = symbolName;
	}

}
