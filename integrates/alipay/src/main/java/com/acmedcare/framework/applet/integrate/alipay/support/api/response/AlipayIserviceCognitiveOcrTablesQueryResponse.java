package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.AiOcrTableRow;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.tables.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceCognitiveOcrTablesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4117778763258448937L;

	/** 
	 * true：识别成功
false: 识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 表格内容
	 */
	@ApiListField("tables")
	@ApiField("ai_ocr_table_row")
	private List<AiOcrTableRow> tables;

	/** 
	 * 服务请求唯一标示id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTables(List<AiOcrTableRow> tables) {
		this.tables = tables;
	}
	public List<AiOcrTableRow> getTables( ) {
		return this.tables;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
