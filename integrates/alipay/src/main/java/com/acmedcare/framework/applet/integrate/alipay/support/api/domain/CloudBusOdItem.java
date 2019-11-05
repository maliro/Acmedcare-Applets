package com.acmedcare.framework.applet.integrate.alipay.support.api.domain;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayObject;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;

/**
 * OD 查询数据结果
 *
 * @author auto create
 * @since 1.0, 2019-08-01 15:39:32
 */
public class CloudBusOdItem extends AlipayObject {

	private static final long serialVersionUID = 1114583888484544663L;

	/**
	 * 实际公交od值
	 */
	@ApiField("bus_od")
	private Long busOd;

	/**
	 * geo hash
	 */
	@ApiField("dest_geohash")
	private String destGeohash;

	/**
	 * 潜在od值
	 */
	@ApiField("od")
	private Long od;

	/**
	 * 非工作日od日均
	 */
	@ApiField("week_od")
	private Long weekOd;

	/**
	 * 工作日od日均
	 */
	@ApiField("work_od")
	private Long workOd;

	public Long getBusOd() {
		return this.busOd;
	}
	public void setBusOd(Long busOd) {
		this.busOd = busOd;
	}

	public String getDestGeohash() {
		return this.destGeohash;
	}
	public void setDestGeohash(String destGeohash) {
		this.destGeohash = destGeohash;
	}

	public Long getOd() {
		return this.od;
	}
	public void setOd(Long od) {
		this.od = od;
	}

	public Long getWeekOd() {
		return this.weekOd;
	}
	public void setWeekOd(Long weekOd) {
		this.weekOd = weekOd;
	}

	public Long getWorkOd() {
		return this.workOd;
	}
	public void setWorkOd(Long workOd) {
		this.workOd = workOd;
	}

}
