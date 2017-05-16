package com.yt.app.api.v1.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yt.app.frame.p.DateTimeUtil;

/**
 * @author zj default
 * 
 * @version v1
 * @createdate 2017-04-20 13:48:48
 */
@Getter
@Setter
public class Organizations implements Serializable {

	private static final long serialVersionUID = 1L;

	Long id;
	Integer version;
	String codename;
	String name;
	String shortname;
	String departmenttype;
	String legalentitycode;
	String legalentity;
	Long managerid;
	Long orgtype;
	Object campusarea;
	Object campususingarea;
	Long cityid;
	String cityname;
	String fullpath;
	@JsonFormat(pattern = DateTimeUtil.DEFAULT_DATE_FORMAT)
	java.util.Date deliverdate;
	String bistatus;
	Long status;
	String statusname;
	String orgtypename;

	public Organizations() {
	}

	public Organizations(Long id, Integer version, String codename, String name, String shortname, String departmenttype, String legalentitycode,
			String legalentity, Long managerid, Long orgtype, Object campusarea, Object campususingarea, Long cityid, String cityname,
			String fullpath, java.util.Date deliverdate, String bistatus, Long status) {
		this.id = id;
		this.version = version;
		this.codename = codename;
		this.name = name;
		this.shortname = shortname;
		this.departmenttype = departmenttype;
		this.legalentitycode = legalentitycode;
		this.legalentity = legalentity;
		this.managerid = managerid;
		this.orgtype = orgtype;
		this.campusarea = campusarea;
		this.campususingarea = campususingarea;
		this.cityid = cityid;
		this.cityname = cityname;
		this.fullpath = fullpath;
		this.deliverdate = deliverdate;
		this.bistatus = bistatus;
		this.status = status;
	}
}