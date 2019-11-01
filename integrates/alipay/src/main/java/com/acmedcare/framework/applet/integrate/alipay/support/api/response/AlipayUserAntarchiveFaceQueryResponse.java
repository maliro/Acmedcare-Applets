package com.acmedcare.framework.applet.integrate.alipay.support.api.response;

import java.util.List;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.internal.mapping.ApiListField;
import com.acmedcare.framework.applet.integrate.alipay.support.api.domain.ArchiveFaceInfo;

import com.acmedcare.framework.applet.integrate.alipay.support.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antarchive.face.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserAntarchiveFaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7859717224733558743L;

	/** 
	 * 返回人脸图片类型列表.若不存在则返回空列表
	 */
	@ApiListField("archive_face_list")
	@ApiField("archive_face_info")
	private List<ArchiveFaceInfo> archiveFaceList;

	/** 
	 * 是否存在本地可用比对源图片
	 */
	@ApiField("local_usable")
	private Boolean localUsable;

	/** 
	 * 是否存在远程可用比对源图片
	 */
	@ApiField("remote_usable")
	private Boolean remoteUsable;

	public void setArchiveFaceList(List<ArchiveFaceInfo> archiveFaceList) {
		this.archiveFaceList = archiveFaceList;
	}
	public List<ArchiveFaceInfo> getArchiveFaceList( ) {
		return this.archiveFaceList;
	}

	public void setLocalUsable(Boolean localUsable) {
		this.localUsable = localUsable;
	}
	public Boolean getLocalUsable( ) {
		return this.localUsable;
	}

	public void setRemoteUsable(Boolean remoteUsable) {
		this.remoteUsable = remoteUsable;
	}
	public Boolean getRemoteUsable( ) {
		return this.remoteUsable;
	}

}
