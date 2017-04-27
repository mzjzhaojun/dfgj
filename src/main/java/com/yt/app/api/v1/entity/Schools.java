package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:21
 */
@Getter
@Setter
public class Schools implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	Long orgid;
	String schoolname;
	String schoolyear;
	String schoolrange;
	String schoollevel;
	String schoolnature;
	Long creatorid;
	String creatorname;
	java.util.Date createtime;
	Long modifierid;
	String modifiername;
	java.util.Date modifytime;

	public Schools() {
	}

	public Schools(Long id, Integer version, Long orgid, String schoolname, String schoolyear, String schoolrange, String schoollevel,
			String schoolnature, Long creatorid, String creatorname, java.util.Date createtime, Long modifierid, String modifiername,
			java.util.Date modifytime) {
		this.id = id;
		this.version = version;
		this.orgid = orgid;
		this.schoolname = schoolname;
		this.schoolyear = schoolyear;
		this.schoolrange = schoolrange;
		this.schoollevel = schoollevel;
		this.schoolnature = schoolnature;
		this.creatorid = creatorid;
		this.creatorname = creatorname;
		this.createtime = createtime;
		this.modifierid = modifierid;
		this.modifiername = modifiername;
		this.modifytime = modifytime;
	}
}