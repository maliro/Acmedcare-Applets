package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * 洗车保养评论统计信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:21:57
 */
public class MerchantshopCommentStatistic extends AlipayObject {

	private static final long serialVersionUID = 2677222861581784133L;

	/**
	 * 评论总数
	 */
	@ApiField("comment_count")
	private Long commentCount;

	/**
	 * 评分（平均分），两位小数
	 */
	@ApiField("score")
	private Long score;

	public Long getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

}
