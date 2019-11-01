package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 优惠说明信息
 *
 * @author auto create
 * @since 1.0, 2018-09-14 13:54:41
 */
public class VoucherDescDetailModel extends AlipayObject {

	private static final long serialVersionUID = 8847191823773988619L;

	/**
	 * 优惠的说明信息
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 优惠的标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
