package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.VoucherTemplateLiteInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.templatelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingVoucherTemplatelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5495447567834491325L;

	/** 
	 * 当前页码,页码从1开始
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 总条数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 券模板列表
	 */
	@ApiListField("voucher_templates")
	@ApiField("voucher_template_lite_info")
	private List<VoucherTemplateLiteInfo> voucherTemplates;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Long getItemsPerPage( ) {
		return this.itemsPerPage;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setVoucherTemplates(List<VoucherTemplateLiteInfo> voucherTemplates) {
		this.voucherTemplates = voucherTemplates;
	}
	public List<VoucherTemplateLiteInfo> getVoucherTemplates( ) {
		return this.voucherTemplates;
	}

}
