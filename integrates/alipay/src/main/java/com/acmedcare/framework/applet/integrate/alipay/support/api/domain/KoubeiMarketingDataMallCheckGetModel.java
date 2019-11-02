package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 商圈圈子用户产生数据安全校验
 *
 * @author auto create
 * @since 1.0, 2018-06-20 13:41:41
 */
public class KoubeiMarketingDataMallCheckGetModel extends AlipayObject {

	private static final long serialVersionUID = 7142762545245448431L;

	/**
	 * 安全校验数据内容入参
	 */
	@ApiListField("check_contents")
	@ApiField("data_sec_check_content")
	private List<DataSecCheckContent> checkContents;

	/**
	 * 数据源:USER--C端，MERCHANT--B端
	 */
	@ApiField("data_source")
	private String dataSource;

	public List<DataSecCheckContent> getCheckContents() {
		return this.checkContents;
	}
	public void setCheckContents(List<DataSecCheckContent> checkContents) {
		this.checkContents = checkContents;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

}