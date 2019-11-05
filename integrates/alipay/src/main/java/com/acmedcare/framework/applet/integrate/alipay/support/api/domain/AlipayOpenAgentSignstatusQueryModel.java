package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * isv查询商户某个产品的签约状态
 *
 * @author auto create
 * @since 1.0, 2019-07-04 11:16:35
 */
public class AlipayOpenAgentSignstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1481979864376547638L;

	/**
	 * isv要查询签约状态的商户账号，是支付宝账号pid（2088开头）
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * isv要查询商户签约状态的产品码，产品码是支付宝内部对产品的唯一标识
	 */
	@ApiListField("product_codes")
	@ApiField("string")
	private List<String> productCodes;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

}
