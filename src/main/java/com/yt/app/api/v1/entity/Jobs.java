package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-27 19:22:20
 */
@Getter
@Setter
public class Jobs implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String jobname;
	Long orgid;
	Long staffid;
	Long parentid;
	Long isprimary;
	Long isfulltime;
	Long jobcodeid;
	String fullpath;
	Long status;
	String bistatus;
	String orgidname;
	String staffidname;
	String statusname;
	String isprimaryname;
	String isfulltimename;
	String jobcodeidname;

	public Jobs() {
	}

	public Jobs(Long id, Integer version, String jobname, Long orgid, Long staffid, Long parentid, Long isprimary, Long isfulltime, Long jobcodeid,
			String fullpath, Long status, String bistatus) {
		this.id = id;
		this.version = version;
		this.jobname = jobname;
		this.orgid = orgid;
		this.staffid = staffid;
		this.parentid = parentid;
		this.isprimary = isprimary;
		this.isfulltime = isfulltime;
		this.jobcodeid = jobcodeid;
		this.fullpath = fullpath;
		this.status = status;
		this.bistatus = bistatus;
	}
}