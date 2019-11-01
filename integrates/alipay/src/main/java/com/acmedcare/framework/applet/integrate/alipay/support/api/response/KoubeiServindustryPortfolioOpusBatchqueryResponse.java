package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.OpusInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.portfolio.opus.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiServindustryPortfolioOpusBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2397718681949174131L;

	/** 
	 * 素材列表
	 */
	@ApiListField("opuses")
	@ApiField("opus_info")
	private List<OpusInfo> opuses;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setOpuses(List<OpusInfo> opuses) {
		this.opuses = opuses;
	}
	public List<OpusInfo> getOpuses( ) {
		return this.opuses;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
