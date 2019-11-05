package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import java.util.List;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;

/**
 * 单个主记录+对应资金明细信息模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:31:15
 */
public class SingleFundDetailItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 5754971156691995215L;

	/**
	 * 批次资金明细模型列表
	 */
	@ApiListField("batch_fund_item_model_list")
	@ApiField("batch_fund_item_a_o_p_model")
	private List<BatchFundItemAOPModel> batchFundItemModelList;

	/**
	 * 消费记录主记录
	 */
	@ApiField("consume_record")
	private ConsumeRecordAOPModel consumeRecord;

	public List<BatchFundItemAOPModel> getBatchFundItemModelList() {
		return this.batchFundItemModelList;
	}
	public void setBatchFundItemModelList(List<BatchFundItemAOPModel> batchFundItemModelList) {
		this.batchFundItemModelList = batchFundItemModelList;
	}

	public ConsumeRecordAOPModel getConsumeRecord() {
		return this.consumeRecord;
	}
	public void setConsumeRecord(ConsumeRecordAOPModel consumeRecord) {
		this.consumeRecord = consumeRecord;
	}

}
