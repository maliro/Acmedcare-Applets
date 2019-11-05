package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 系统商创建作品接口
 *
 * @author auto create
 * @since 1.0, 2017-10-20 11:05:01
 */
public class KoubeiServindustryPortfolioOpusCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3196762853286794155L;

	/**
	 * ISV插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 作品列表信息
	 */
	@ApiListField("opuses")
	@ApiField("opus_info")
	private List<OpusInfo> opuses;

	/**
	 * 作品集ID
	 */
	@ApiField("portfolio_id")
	private String portfolioId;

	/**
	 * 操作人信息
	 */
	@ApiField("portfolio_operator_info")
	private PortfolioOperatorInfo portfolioOperatorInfo;

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public List<OpusInfo> getOpuses() {
		return this.opuses;
	}
	public void setOpuses(List<OpusInfo> opuses) {
		this.opuses = opuses;
	}

	public String getPortfolioId() {
		return this.portfolioId;
	}
	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public PortfolioOperatorInfo getPortfolioOperatorInfo() {
		return this.portfolioOperatorInfo;
	}
	public void setPortfolioOperatorInfo(PortfolioOperatorInfo portfolioOperatorInfo) {
		this.portfolioOperatorInfo = portfolioOperatorInfo;
	}

}
